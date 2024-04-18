from Sistema import inserir_produto, inserir_valor
from time import sleep

lista_de_compras = {}
codigo = 1
total = 0

print('Bem-Vindo a padaria [nome]')
sleep(1)

while True:
    produto = inserir_produto()
    valor = inserir_valor()
    lista_de_compras[produto] = valor
    print('Adicionando...')
    sleep(1)
    print('Adicionado')
    print('-+' * 10)
    total += valor
    for produto, valor in lista_de_compras.items():
        print(f'- {produto:<16}{codigo}\n  {valor:.2f}\n')
        codigo += 1
    print(f'TOTAL: {total:.2f}')
    print('-+' * 10)
    codigo = 1
    continuar = input('Continuar? [S/N]: ').strip().lower()
    if continuar[0] == 'n':
        break 
    
for produto, valor in lista_de_compras.items():
    print(f'- {produto:<16}{codigo}\n  {valor:.2f}\n')
    codigo += 1
print(f'TOTAL: {total:.2f}')