from time import sleep
from Sistema import limpa_tela, total

lista_de_compras = {}

contador = 1
total_compra = codigo = 0
quants = []

print('Bem-Vindo a padaria [nome]')
sleep(1)

while True:
    produto = input('Nome do produto: ').strip()
    while True:
        try:
            valor = float(input('Valor: '))
            while True:
                try:
                    quantidade = int(input('Quantidade: '))
                    break
                except:
                    print('Dado incorreto. Insira novamente.')
            quants.append(quantidade)
            valor_vezes_quantidade = valor * quants[codigo]
            codigo += 1
            break
        except:
            print('Dado incorreto. Insira novamente.')
    lista_de_compras[produto] = valor
    print('Adicionando...')
    sleep(1)
    print('Adicionado')
    sleep(1)

    limpa_tela()

    print('-+' * 10)
    total_compra += valor_vezes_quantidade
    for produto, valor in lista_de_compras.items():
        print(f'- {produto:<16}{contador}\n  R${valor * quants[contador - 1]:.2f}\n'  
              f'(qnt{quants[contador - 1]:>4} x R${valor:.2f})\n')
        contador += 1
    total(total_compra)
    contador = 1
    continuar = input('Continuar? [S/N]: ').strip().lower()
    limpa_tela()
    if continuar[0] == 'n':
        codigo = 0
        break 
    
for produto, valor in lista_de_compras.items():
    print(f'- {produto:<16}{contador}\n  R${valor * quants[contador - 1]:.2f}\n'  
          f'(qnt{quants[contador - 1]:>4} x R${valor:.2f})\n')
    sleep(0.5)
    codigo += 1

total(total_compra)
sleep(1)


while True:
    forma_de_pagamento = int(input('Qual a forma de pagamento?\n'
        '1- Dinheiro\n'
        '2- Cartão de debito\n'
        '3- Cartão de credito\n'
        '4- Pix\n'
        '> '))

    if forma_de_pagamento == 1:
        dinheiro = float(input('Quantia em dinheiro: R$ '))
        limpa_tela()
        if dinheiro <= total_compra:
            print('Dinheiro insuficiente...')
            total(total_compra)
            insuficiente = input('Trocar forma de pagamento? [S/N] ').strip().lower()
            if 'n' in insuficiente:
                print('Compra recusada.')
                break
        else:
            print('-=' * 10)
            print(f'Seu troco é R$ {dinheiro - total_compra:.2f}')
            print('-=' * 10)
            break
    elif type(forma_de_pagamento) != int:
        print('Valor invalido.')
    else:
        print('Compra aprovada!\n')
        break

print('Compra finalizada!\n'
      'Volte sempre!')
