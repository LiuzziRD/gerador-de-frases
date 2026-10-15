const fraseElemento = document.getElementById("frase");
const autorElemento = document.getElementById("autor");
const dataElemento = document.getElementById("data");

const API_URL = "http://localhost:8080/frasedodia";

async function carregarFrase() {
    try {
        const resposta = await fetch(API_URL);

        if (!resposta.ok) {
            throw new Error("Não foi possível carregar a frase.");
        }

        const frase = await resposta.json();

        fraseElemento.textContent = frase.quote;
        autorElemento.textContent = frase.author;
        dataElemento.textContent = formatarData(frase.date);

    } catch (erro) {
        console.error("Erro ao carregar a frase:", erro);

        fraseElemento.textContent = "ERRO =(";
        autorElemento.textContent = "";
        dataElemento.textContent = "";
    }
}

function formatarData(data) {
    const [ano, mes, dia] = data.split("-");
    return `${dia}/${mes}/${ano}`;
}

carregarFrase();