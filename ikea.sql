CREATE TABLE `User` (
  `id` int PRIMARY KEY,
  `username` varchar(255),
  `password` varchar(255),
  `level` enum
);

CREATE TABLE `Barang` (
  `id` int PRIMARY KEY,
  `nama` varchar(255),
  `stok` int,
  `harga` int,
  `created_at` timestamps,
  `updated_at` timestamps
);

CREATE TABLE `Pesanan` (
  `id` int PRIMARY KEY,
  `transaksi_id` int,
  `jumlah` int,
  `total` int
);

CREATE TABLE `Transaksi` (
  `id` int PRIMARY KEY,
  `nama` varchar(255),
  `total` int,
  `bayar` int,
  `created_at` timestamps,
  `updated_at` timestamps
);

ALTER TABLE `Transaksi` ADD FOREIGN KEY (`id`) REFERENCES `Pesanan` (`transaksi_id`);
