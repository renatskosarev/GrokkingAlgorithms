def format(tel: str) -> str:
    tel = tel.replace('-', '').replace('(', '').replace(')', '')

    if tel.startswith(('8', '+7')):
        tel = tel.replace('+7', '8')
    else:
        tel = '8495' + tel
    return tel


newtel = format(input())
for i in range(3):
    print('YES' if newtel == format(input()) else 'NO')
