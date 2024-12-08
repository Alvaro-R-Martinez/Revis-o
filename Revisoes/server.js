const express = require('express');
const bodyParser = require('body-parser');
const fs = require('fs');
const path = require('path');

const app = express();
const PORT = 3000;

// Middleware para analisar o corpo das requisições
app.use(bodyParser.json());
app.use(express.static('public')); // Serve arquivos estáticos da pasta 'public'

// Caminho para o arquivo JSON
const jsonFilePath = path.join(__dirname, 'revisoes.json');

// Função para ler o arquivo JSON
function lerRevisoes() {
    const dados = fs.readFileSync(jsonFilePath, 'utf-8');
    return JSON.parse(dados);
}

// Função para salvar revisões no arquivo JSON
function salvarRevisoes(revisoes) {
    fs.writeFileSync(jsonFilePath, JSON.stringify(revisoes, null, 2), 'utf-8');
}

// Rota para buscar todas as revisões
app.get('/api/revisoes/hoje', (req, res) => {
    const revisoes = lerRevisoes();
    const hoje = new Date().toLocaleDateString('pt-BR', { day: '2-digit', month: '2-digit', year: 'numeric' });

    const revisoesHoje = revisoes.filter(item => {
        return item.revisoes.some(revisao => {
            const dataRevisao = new Date(revisao.data).toLocaleDateString('pt-BR', { day: '2-digit', month: '2-digit', year: 'numeric' });
            return dataRevisao === hoje;
        });
    });

    res.json(revisoesHoje);
});

// Rota para salvar uma nova revisão
app.post('/api/revisoes', (req, res) => {
    const novaRevisao = req.body;
    const revisoes = lerRevisoes();
    revisoes.push(novaRevisao);
    salvarRevisoes(revisoes);
    res.status(201).json({ message: 'Revisão salva com sucesso!' });
});

// Iniciar o servidor
app.listen(PORT, () => {
    console.log(`Servidor rodando na porta ${PORT}`);
});
