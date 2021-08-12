$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/AddToCart.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#enconding: UTF-8"
    }
  ],
  "line": 4,
  "name": "AddToCart",
  "description": "",
  "id": "addtocart",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@AddToCart"
    },
    {
      "line": 3,
      "name": "@End2End"
    }
  ]
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Adicionar produto ao carrinho",
  "description": "",
  "id": "addtocart;adicionar-produto-ao-carrinho",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 10,
      "name": "@AdicionarProduto"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "acionar o produto Sauce Labs Backpack",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "clicar no botao Add To Cart",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "o sistema deve adicionar o produto ao carrinho, exibindo o botao REMOVE.",
  "keyword": "Entao "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "addtocart;adicionar-produto-ao-carrinho;",
  "rows": [
    {
      "cells": [
        "user",
        "password"
      ],
      "line": 17,
      "id": "addtocart;adicionar-produto-ao-carrinho;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 18,
      "id": "addtocart;adicionar-produto-ao-carrinho;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 2512224600,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 7,
  "name": "que o usuario esteja na pagina principal do sistema",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "que o usuario esteja logado",
  "keyword": "E "
});
formatter.match({
  "location": "StepLogin.que_o_usuario_esteja_na_pagina_principal_do_sistema()"
});
formatter.result({
  "duration": 391371900,
  "status": "passed"
});
formatter.match({
  "location": "StepLogin.que_o_usuario_esteja_logado()"
});
formatter.result({
  "duration": 603242300,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Adicionar produto ao carrinho",
  "description": "",
  "id": "addtocart;adicionar-produto-ao-carrinho;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 3,
      "name": "@End2End"
    },
    {
      "line": 10,
      "name": "@AdicionarProduto"
    },
    {
      "line": 3,
      "name": "@AddToCart"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "acionar o produto Sauce Labs Backpack",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "clicar no botao Add To Cart",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "o sistema deve adicionar o produto ao carrinho, exibindo o botao REMOVE.",
  "keyword": "Entao "
});
formatter.match({
  "location": "StepAddToCart.acionar_o_produto_Sauce_Labs_Backpack()"
});
formatter.result({
  "duration": 505438200,
  "status": "passed"
});
formatter.match({
  "location": "StepAddToCart.clicar_no_botao_Add_To_Cart()"
});
formatter.result({
  "duration": 96929200,
  "status": "passed"
});
formatter.match({
  "location": "StepAddToCart.o_sistema_deve_adicionar_o_produto_ao_carrinho_exibindo_o_botao_REMOVE()"
});
formatter.result({
  "duration": 69932100,
  "status": "passed"
});
formatter.after({
  "duration": 718128600,
  "status": "passed"
});
formatter.uri("Features/Checkout.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#enconding: UTF-8"
    }
  ],
  "line": 4,
  "name": "Checkout",
  "description": "",
  "id": "checkout",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@Checkout"
    },
    {
      "line": 3,
      "name": "@End2End"
    }
  ]
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Fazer checkout do carrinho vazio",
  "description": "",
  "id": "checkout;fazer-checkout-do-carrinho-vazio",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 10,
      "name": "@CheckoutVazio"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "acionar o botao do carrinho",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "clicar no botao Checkout",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "informar o campo Fist Name como \"\u003cfirstName\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "informar o campo Last Name como \"\u003clastName\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "informar o campo Postal Code como \"\u003cpostalCode\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "clicar no botao Continue",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "clicar no botao Finish",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "o sistema ira validar o checkout sem nenhum item, exibindo a pagina de agradecimento.",
  "keyword": "Entao "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "checkout;fazer-checkout-do-carrinho-vazio;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "postalCode"
      ],
      "line": 22,
      "id": "checkout;fazer-checkout-do-carrinho-vazio;;1"
    },
    {
      "cells": [
        "Pedro",
        "Paulo",
        "123456"
      ],
      "line": 23,
      "id": "checkout;fazer-checkout-do-carrinho-vazio;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 1584838300,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 7,
  "name": "que o usuario esteja na pagina principal do sistema",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "que o usuario esteja logado",
  "keyword": "E "
});
formatter.match({
  "location": "StepLogin.que_o_usuario_esteja_na_pagina_principal_do_sistema()"
});
formatter.result({
  "duration": 318052600,
  "status": "passed"
});
formatter.match({
  "location": "StepLogin.que_o_usuario_esteja_logado()"
});
formatter.result({
  "duration": 535979300,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Fazer checkout do carrinho vazio",
  "description": "",
  "id": "checkout;fazer-checkout-do-carrinho-vazio;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 3,
      "name": "@End2End"
    },
    {
      "line": 10,
      "name": "@CheckoutVazio"
    },
    {
      "line": 3,
      "name": "@Checkout"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "acionar o botao do carrinho",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "clicar no botao Checkout",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "informar o campo Fist Name como \"Pedro\"",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "informar o campo Last Name como \"Paulo\"",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "informar o campo Postal Code como \"123456\"",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "clicar no botao Continue",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "clicar no botao Finish",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "o sistema ira validar o checkout sem nenhum item, exibindo a pagina de agradecimento.",
  "keyword": "Entao "
});
formatter.match({
  "location": "StepCheckout.acionar_o_botao_do_carrinho()"
});
formatter.result({
  "duration": 523338900,
  "status": "passed"
});
formatter.match({
  "location": "StepCheckout.clicar_no_botao_Checkout()"
});
formatter.result({
  "duration": 118871900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pedro",
      "offset": 33
    }
  ],
  "location": "StepCheckout.informar_o_campo_Fist_Name_como(String)"
});
formatter.result({
  "duration": 132412600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Paulo",
      "offset": 33
    }
  ],
  "location": "StepCheckout.informar_o_campo_Last_Name_como(String)"
});
formatter.result({
  "duration": 120033600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 35
    }
  ],
  "location": "StepCheckout.informar_o_campo_Postal_Code_como(String)"
});
formatter.result({
  "duration": 129827600,
  "status": "passed"
});
formatter.match({
  "location": "StepCheckout.clicar_no_botao_Continue()"
});
formatter.result({
  "duration": 105079800,
  "status": "passed"
});
formatter.match({
  "location": "StepCheckout.clicar_no_botao_Finish()"
});
formatter.result({
  "duration": 117687400,
  "status": "passed"
});
formatter.match({
  "location": "StepCheckout.o_sistema_ira_validar_o_checkout_sem_nenhum_item_exibindo_a_pagina_de_agradecimento()"
});
formatter.result({
  "duration": 78330700,
  "status": "passed"
});
formatter.after({
  "duration": 731380500,
  "status": "passed"
});
formatter.uri("Features/Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#enconding: UTF-8"
    }
  ],
  "line": 4,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    },
    {
      "line": 3,
      "name": "@End2End"
    }
  ]
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Realizar Login com sucesso",
  "description": "",
  "id": "login;realizar-login-com-sucesso",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 9,
      "name": "@RealizarLogin"
    },
    {
      "line": 9,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "preencher o campo Username como \"\u003cusuario\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "preencher o campo Password como \"\u003csenha\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "clicar no botao Login",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "o sistema deve autorizar o login, exibindo a pagina contendo os produtos.",
  "keyword": "Entao "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "login;realizar-login-com-sucesso;",
  "rows": [
    {
      "cells": [
        "usuario",
        "senha"
      ],
      "line": 17,
      "id": "login;realizar-login-com-sucesso;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 18,
      "id": "login;realizar-login-com-sucesso;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 1613738900,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 7,
  "name": "que o usuario esteja na pagina principal do sistema",
  "keyword": "Dado "
});
formatter.match({
  "location": "StepLogin.que_o_usuario_esteja_na_pagina_principal_do_sistema()"
});
formatter.result({
  "duration": 309649400,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Realizar Login com sucesso",
  "description": "",
  "id": "login;realizar-login-com-sucesso;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    },
    {
      "line": 3,
      "name": "@End2End"
    },
    {
      "line": 9,
      "name": "@RealizarLogin"
    },
    {
      "line": 9,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "preencher o campo Username como \"standard_user\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "preencher o campo Password como \"secret_sauce\"",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "clicar no botao Login",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "o sistema deve autorizar o login, exibindo a pagina contendo os produtos.",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 33
    }
  ],
  "location": "StepLogin.preencher_o_campo_Username_como(String)"
});
formatter.result({
  "duration": 187887700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 33
    }
  ],
  "location": "StepLogin.preencher_o_campo_Password_como(String)"
});
formatter.result({
  "duration": 165611800,
  "status": "passed"
});
formatter.match({
  "location": "StepLogin.clicar_no_botao_Login()"
});
formatter.result({
  "duration": 203903700,
  "status": "passed"
});
formatter.match({
  "location": "StepLogin.o_sistema_deve_autorizar_o_login_exibindo_a_pagina_contendo_os_produtos()"
});
formatter.result({
  "duration": 389154600,
  "status": "passed"
});
formatter.after({
  "duration": 685333200,
  "status": "passed"
});
});