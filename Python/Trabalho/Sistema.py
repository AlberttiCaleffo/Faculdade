import os
from time import sleep

def limpa_tela():
    if os.name == 'posix':
        os.system('clear')
    elif os.name == 'nt':
        os.system('cls')

def total(total):
    print('-+' * 10)
    print(f'TOTAL: R${total:.2f}')
    print('-+' * 10)
    sleep(1)
    
def compra(lista_de_compras, quants, contador):
    for produto, valor in lista_de_compras.items():
        print(f'- {produto:<16}{contador}\n  R${valor * quants[contador - 1]:.2f}\n'  
              f'(qnt{quants[contador - 1]:>4} x R${valor:.2f})\n')
        contador += 1
        sleep(0.5)
        
# def menu():
#     opcao = input('Menu:\n'
#           '1- Efetuar uma venda.\n'
#           '2- Vizualizar estoque.\n'
#           '> ')