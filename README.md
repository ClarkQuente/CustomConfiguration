# CustomConfiguration

<h1 align="center">CustomConfiguration</h1>

<p align="center">Crie arquivos .yml facilmente.</p>

## Como Utilizar

<h3> • Passo 1 </h3>
Para gerar outros arquivos .yml, antes você precisa gerar a sua config.yml.

Para gerar a sua config.yml, basta colocar em seu onEnable:
```yaml
saveDefaultConfig();
```

<h3> • Passo 2 </h3>
Depois, você irá copiar a classe CustomConfiguration que está nesse repositório.

<h3> • Passo 3 </h3>
O próximo passo, você deverá fazer o seguinte:

```yaml
  private static CustomConfiguration <variavel>;

@Override
public void onEnable() {
  saveDefaultConfig();

  <variavel> = new CustomConfiguration("nome-do-arquivo.yml");
}
```

## Interessantes
Você pode criar o seu arquivo.yml na sua IDE e ele irá gerar com as informações que você colocou lá!
