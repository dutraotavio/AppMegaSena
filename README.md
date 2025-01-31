<h1>Nesse projeto aprendemos:</h1>

**1. Estrutura de uma Activity no Android**

•	Como a classe MainActivity herda de AppCompatActivity para usar as funcionalidades básicas de uma Activity no Android.

•	Como o método onCreate() é o ponto inicial de execução da Activity e é onde você configura a interface do usuário e a lógica inicial.

**2. Uso de Views no Android**

•	Como referenciar elementos da interface do usuário (como EditText, TextView, Button) usando findViewById.

•	Como associar variáveis a esses elementos para manipulá-los programaticamente (como o botão de sorteio ou o campo de texto).

**3. Uso do SharedPreferences**

•	Como criar e acessar o arquivo de preferências do aplicativo com getSharedPreferences.

•	Como salvar e recuperar dados simples (como o resultado do sorteio) usando SharedPreferences.

•	Como usar a função apply() para salvar dados de maneira assíncrona.

**4. Uso de Toasts**

•	Como exibir mensagens curtas para o usuário, utilizando Toast.makeText().

•	Como configurar a duração do Toast (Toast.LENGTH_LONG ou Toast.LENGTH_SHORT).

**5. Manipulação de Strings**

•	Como manipular texto inserido pelo usuário (editText.text.toString()).

•	Como usar o método joinToString() para formatar a saída de uma lista, convertendo um conjunto de números para uma string com separação personalizada.

**6. Controle de Fluxo**

•	Como usar a estrutura de controle if para validar dados de entrada do usuário, garantindo que o número inserido esteja dentro de um intervalo especificado (6 a 15).

•	Como usar a função return para interromper a execução caso a validação falhe.

**7. Geração de Números Aleatórios**

•	Como utilizar a classe Random para gerar números aleatórios dentro de um intervalo (no caso, de 1 a 60).

•	Como garantir que os números gerados sejam únicos utilizando um mutableSetOf, já que ele não permite elementos duplicados.

**8. Configuração de Interface e Estilo**

•	Como configurar a interface do aplicativo para usar um layout imersivo, através do método enableEdgeToEdge().

•	Como esconder a barra de ação com supportActionBar?.hide() para uma interface mais limpa.

**9. Integração com o Layout XML**

•	Como integrar a lógica do código Kotlin com os elementos definidos no layout XML (exemplo: associar um Button para realizar a ação de sorteio, ou um TextView para mostrar o resultado).

**10. Boas Práticas no Android**

•	Como organizar o código utilizando boas práticas, como a utilização do lateinit para inicializar variáveis posteriormente e o uso do apply() para editar o SharedPreferences.

•	Como criar uma interface simples e intuitiva, que permite ao usuário interagir facilmente com o app.

**11. Debugging e Mensagens de Erro**

•	Como mostrar mensagens de erro ou instrução para o usuário, como no caso de quando o número de apostas fornecido é inválido (mostrando um Toast).

**12. Uso de Set para Evitar Duplicação**

•	Como usar um Set (neste caso, mutableSetOf) para garantir que os números sorteados não sejam repetidos.
