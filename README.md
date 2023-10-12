# Post-Test-2-PBO

### Nama: Dinda Nur Aini
### NIM: 2209116023
### Kelas: A1 Sistem Informasi A
### Tema: Toko Cat

Studi kasus "Toko Cat" menggambarkan sebuah toko cat yang memanfaatkan program untuk mengelola produk cat, mengelola daftar kasir, dan mencatat penjualan. Pemilik toko dapat dengan mudah melihat, menambah, mengedit, dan menghapus produk cat dari stok mereka, merekrut dan menghapus kasir yang bekerja di toko, serta mencatat setiap transaksi pembelian. Dengan melihat riwayat transaksi, pemilik toko dapat memantau kinerja dan tren penjualan produk, membantu dalam pengelolaan yang lebih efisien.

#### CODING

#### Source Package

![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/26e8bbfb-90b7-4116-875e-fd00165a0ffc)



#### Source Code


### Package TokoCat

#### Entitas TokoCat


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/82776510-633c-4399-a1dd-9a7787203721)

![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/1f5b04fa-4768-4aed-ad33-a9f8f3af8531)

![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/43554da7-e9a1-4083-b32f-09e77dfc97d8)

![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/0c877157-ef54-4276-9905-341adf686907)

![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/b7613269-e2f4-49b4-9db4-2b404f0ef382)

Ini adalah kelas yang mengelola operasi dan data terkait toko cat.
Menggunakan ArrayList untuk menyimpan produk cat, kasir (sebelumnya karyawan), dan transaksi.
Mengimplementasikan operasi CRUD (Create, Read, Update, Delete) untuk produk cat dan kasir.
Memiliki metode untuk melihat produk, menambah produk, mengedit produk, menghapus produk, melihat kasir, menambah kasir, menghapus kasir, serta operasi pembelian produk dan melihat riwayat transaksi.

#### Entitas Karyawan


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/ee40b7c4-6f96-454e-9cab-aa9e85b7e713)

Ini adalah entitas yang mewakili kasir di toko.
Menyimpan informasi seperti nama kasir dan gaji.
Memiliki setter dan getter untuk mengakses properti dan metode toString untuk representasi string.

#### Entitas ProdukCat


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/02d3eff1-1df7-4185-ac02-01bcfd3f2b17)

Ini adalah entitas yang mewakili produk cat yang dijual di toko.
Menyimpan informasi seperti nama produk cat dan harga.
Memiliki setter dan getter untuk mengakses properti dan metode toString untuk representasi string.

#### Entitas Transaksi


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/ad5cfab0-61ce-44d5-9898-179f827dd6b8)

Ini adalah entitas yang mewakili transaksi pembelian produk.
Menghubungkan kasir (sebelumnya karyawan) dengan produk yang dibeli.
Memiliki setter dan getter untuk mengakses properti dan metode toString untuk representasi string.

### Package main

#### Entitas Main


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/ffee1f2c-65da-4b37-8c1f-94e96e254742)
![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/586579b9-4691-4f0c-8d5c-e9eb134a27fd)


Ini adalah kelas utama program.
Ini berfungsi sebagai penghubung antara pengguna (melalui menu) dan kelas TokoCat serta kelas entitas lainnya.
Menyediakan menu interaktif yang memungkinkan pengguna untuk memilih berbagai operasi seperti melihat produk, menambah produk, mengedit produk, menghapus produk, melihat karyawan, menambah karyawan, menghapus karyawan, membeli produk, dan melihat riwayat transaksi.
Menggunakan objek dari kelas TokoCat untuk menjalankan operasi yang sesuai.

### Output

#### Menu Utama

#### Menu Utama 1


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/87ae20ff-5678-49ab-a4dc-09fe84cf2ec9)


Opsi ini digunakan untuk melihat daftar produk cat yang tersedia di toko.
Memungkinkan pengguna untuk melihat semua produk cat beserta nama dan harga masing-masing.

#### Menu Utama 2


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/d03e081c-ca5d-4f4e-815e-e8db31c48a88)


Opsi ini digunakan untuk menambahkan produk cat baru ke daftar produk yang tersedia di toko.
Pengguna diminta untuk memasukkan nama produk dan harganya.

#### Menu Utama 3


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/0775cc5a-4b0d-462f-b841-29e2f3cc6c39)


Opsi ini digunakan untuk mengedit informasi produk cat yang ada.
Pengguna dapat memilih produk yang akan diedit berdasarkan ID, dan kemudian mengganti nama dan harga produk.

Tampilan jika memilih nomor yang tidak ada di pilihan


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/230affb2-7379-4faa-b7cc-0763218a66bf)

#### Menu Utama 4


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/28b7477c-eb59-4b6c-80bd-5b0862d4cfc3)


Opsi ini digunakan untuk menghapus produk cat dari daftar produk yang tersedia di toko.
Pengguna memilih produk yang akan dihapus berdasarkan nomor, dan produk tersebut dihapus dari daftar.

Tampilan jika memilih nomor yang tidak ada di pilihan


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/8600df5e-5b48-4e23-a4a6-7816769d537f)

#### Menu Utama 5


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/67c07de8-67d0-4800-a408-11a00c149b91)


Opsi ini digunakan untuk melihat daftar kasir yang bekerja di toko.
Menampilkan informasi seperti nama kasir, jabatan, dan nomor kasir.

#### Menu Utama 6


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/e2be0de1-5ef2-44da-aff2-914e96b5479b)


Opsi ini digunakan untuk menambahkan kasir baru ke daftar karyawan yang bekerja di toko.
Pengguna diminta untuk memasukkan nama kasir dan gajinya.

#### Menu Utama 7

![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/9e8705f6-f3c5-46e1-9b45-aceba415ce49)

Opsi ini digunakan untuk menghapus kasir dari daftar karyawan yang bekerja di toko.
Pengguna memilih kasir yang akan dihapus berdasarkan nomor, dan kasir tersebut dihapus dari daftar.

Tampilan jika memilih nomor yang tidak ada di pilihan


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/f594f601-42a6-4aed-a6cb-ab73da247ded)


#### Menu Utama 8

![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/b0a4f4e3-728d-413b-b720-529967a8ef8c)


Opsi ini akan mengimplementasikan operasi pembelian produk

Tampilan jika memilih nomor yang tidak ada di pilihan


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/3e95a0a1-e2ae-4041-aeb0-f987018c4937)


#### Menu Utama 9


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/4da83ca4-0f97-4765-9748-5645a345efd0)


Opsi ini akan menampilkan tampilan riwayat transaksi.

#### Menu Utama 10


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/a134c341-b710-43b1-ae90-6a7c699be6be)


Opsi ini digunakan untuk keluar dari program dan mengakhiri eksekusi.

Tampilan jika memilih menu yang tidak ada di pilihan


![image](https://github.com/Dinda023/Post-Test-2-PBO/assets/127454468/f2509fab-d153-42fd-b69f-b59a35f15acd)
