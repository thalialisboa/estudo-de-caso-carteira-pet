# Carteira de Vacinação Digital do Pet

**Estudo de Caso 30**  
**Aluna:** Thalia Lisboa

Este projeto simula a lógica de uma carteira digital de vacinação para pets, desenvolvida em **Kotlin**. O sistema registra vacinas aplicadas, identifica reforços atrasados e informa quando o animal não possui microchip cadastrado.

## Estrutura do código

Todo o código está no arquivo `carteira_pet/src/Main.kt`:

- **`Vacina`**: guarda o nome da vacina e o número de meses necessários para o reforço.
- **`HistoricoMedico`**: registra a vacina aplicada, a data, os meses desde a aplicação e o status.
- **`Tutor`**: armazena o nome, telefone, confirmação de contato e o código opcional do microchip.
- **`estaAtrasada()`**: verifica se passou do prazo definido para o reforço da vacina.
- **`main`**: cria os dados do pet Caramelo, do tutor e do histórico de vacinação; depois exibe os registros e as vacinas pendentes.

## Regras de negócio

- O sistema oferece quatro tipos de vacina usando a estrutura `when`:
  - `1` — V10/V8;
  - `2` — Antiparasitária;
  - `3` — Gripe Canina;
  - `4` — Giárdia.
- Cada vacina possui um prazo, em meses, para a aplicação do reforço.
- Se os meses desde a aplicação forem maiores que o prazo do reforço, o sistema mostra o alerta:

  `ATENÇÃO: Reforço atrasado! Risco à saúde do animal.`

- As vacinas atrasadas são adicionadas à lista de vacinas pendentes.
- O código do microchip é opcional (`String?`). Quando não há código cadastrado, o sistema mostra:

  `Animal não microchipado`

## Conceitos aplicados

O projeto utiliza os conteúdos trabalhados na disciplina:

- Programação Orientada a Objetos (POO);
- classes e objetos;
- variáveis dos tipos `String`, `Double`, `Int` e `Boolean`;
- estruturas condicionais `if/else`;
- estrutura de escolha `when`;
- laço de repetição `for`;
- lista imutável com `listOf`;
- lista mutável com `mutableListOf`;
- Null Safety com tipo anulável (`String?`) e operador Elvis (`?:`).

## Como executar

1. Clone ou baixe este repositório.
2. Abra a pasta `carteira_pet` no **IntelliJ IDEA**.
3. Abra o arquivo `src/Main.kt`.
4. Execute a função `main`.

## Saída esperada

```text
=== CARTEIRA DE VACINAÇÃO DIGITAL ===
Pet: Caramelo
Peso: 8.5 kg
Tutor: Thalia
Microchip: Animal não microchipado
Contato do tutor confirmado.

Vacinas registradas:
- V10/V8 | Aplicada em: 10/09/2025 | Status: Aplicada
ATENÇÃO: Reforço atrasado! Risco à saúde do animal.
- Antiparasitária | Aplicada em: 01/08/2026 | Status: Aplicada
Vacina em dia.
- Gripe Canina | Aplicada em: 15/09/2025 | Status: Aplicada
Vacina em dia.
- Giárdia | Aplicada em: 20/07/2025 | Status: Aplicada
ATENÇÃO: Reforço atrasado! Risco à saúde do animal.

Vacinas pendentes: [V10/V8, Giárdia]
