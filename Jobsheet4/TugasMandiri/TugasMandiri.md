# Tugas Mandiri: Sistem Perpustakaan

## Studi Kasus

Sistem ini memodelkan perpustakaan yang menyimpan koleksi buku, rak buku, dan proses peminjaman. Studi kasus terdiri dari tepat lima class domain selain class `MainTugasMandiri`.

## Identifikasi Relasi

### 1. Aggregation: `Perpustakaan` dan `Buku`

Relasi ini adalah aggregation karena `Buku` dibuat di luar `Perpustakaan`, yaitu pada `MainTugasMandiri`, lalu dikirim melalui parameter constructor `Perpustakaan(String nama, Buku[] koleksi)`. Perpustakaan hanya menyimpan referensi pada atribut `koleksi`; buku tetap dapat digunakan oleh objek lain walaupun objek perpustakaan tidak lagi digunakan.

Bukti utama ada pada `Buku bukuJava = new Buku(...)` di main dan `this.koleksi = koleksi` di constructor `Perpustakaan`.

### 2. Composition: `Rak` dan `SlotBuku`

Relasi ini adalah composition karena `Rak` membuat seluruh objek `SlotBuku` sendiri di dalam constructor melalui `new SlotBuku(i + 1)`. Tidak ada parameter `SlotBuku` atau setter untuk mengganti kumpulan slot dari luar, sehingga slot menjadi bagian internal rak.

Bukti utamanya adalah `slot = new SlotBuku[jumlahSlot]` dan `slot[i] = new SlotBuku(i + 1)` pada constructor `Rak`.

### 3. Aggregation: `SlotBuku` dan `Buku`

Relasi ini adalah aggregation karena `SlotBuku` menyimpan referensi `Buku`, tetapi objek `Buku` dibuat dari luar dan diberikan melalui method `isi(Buku buku)`. Satu slot dapat kosong atau berisi satu buku, sehingga multiplicity-nya `0..1`.

Bukti utamanya adalah atribut `private Buku buku` dan method `isi(Buku buku)` pada `SlotBuku`. `SlotBuku` tidak memanggil `new Buku(...)`.

### 4. Association: `Peminjam` dan `Buku`

Relasi ini adalah association karena `Peminjam` memiliki referensi ke objek `Buku` melalui atribut `bukuDipinjam`, tetapi tidak membuat atau memiliki siklus hidup buku tersebut. Buku dibuat di luar `Peminjam` dan dapat tetap digunakan oleh `Perpustakaan`, `Rak`, atau objek lain.

Bukti utamanya adalah atribut `private Buku bukuDipinjam` dan method `setBukuDipinjam(Buku buku)` pada `Peminjam`.

### 5. Dependency: `Peminjam` dan `Perpustakaan`

Relasi ini adalah dependency karena `Perpustakaan` hanya muncul sebagai parameter method `cekKetersediaan(Perpustakaan perpustakaan)`. Class `Peminjam` tidak menyimpan referensi `Perpustakaan` sebagai atribut; objek perpustakaan hanya digunakan selama method tersebut berjalan.

Bukti utamanya adalah deklarasi `cekKetersediaan(Perpustakaan perpustakaan)` dan pemanggilan `perpustakaan.tersedia(bukuDipinjam)`.
