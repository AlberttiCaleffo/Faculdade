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