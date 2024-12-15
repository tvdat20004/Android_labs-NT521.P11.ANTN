from Crypto.Cipher import AES 
import base64
from Crypto.Util.Padding import unpad

enc_password = base64.b64decode("DTrW2VXjSoFdg0e61fHxJg==")

key = b"This is the super secret key 123"
iv = b'\0' * 16 
cipher = AES.new(key, AES.MODE_CBC, iv)
password = unpad(cipher.decrypt(enc_password), 16)
print(password.decode())