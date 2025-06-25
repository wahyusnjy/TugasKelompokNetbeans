-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 19, 2025 at 03:12 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventory_kelompok_4`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id` int(11) NOT NULL,
  `kode_barang` varchar(10) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `kode_kategori` varchar(10) DEFAULT NULL,
  `kode_lokasi` varchar(10) DEFAULT NULL,
  `stok` int(11) DEFAULT 0,
  `harga` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id`, `kode_barang`, `nama_barang`, `kode_kategori`, `kode_lokasi`, `stok`, `harga`) VALUES
(1, 'EL-001', 'Laptop Dell XPS', 'K001', 'L001', 15, 15000000),
(2, 'EL-002', 'Monitor 24 inch', 'K001', 'L001', 30, 2500000),
(3, 'PK-001', 'Obeng Set', 'K002', 'L002', 50, 150000),
(4, 'PK-002', 'Tang Kombinasi', 'K002', 'L002', 40, 80000),
(5, 'AT-001', 'Kertas A4', 'K003', 'L003', 1000, 50000),
(6, 'AT-002', 'Pulpen Pilot', 'K003', 'L003', 200, 10000),
(7, 'FR-001', 'Meja Kantor', 'K004', 'L004', 20, 1200000),
(8, 'FR-002', 'Kursi Ergonomis', 'K004', 'L004', 25, 1500000),
(9, 'KN-001', 'Air Mineral', 'K005', 'L005', 500, 5000),
(10, 'KN-002', 'Snack Kotak', 'K005', 'L005', 300, 15000);

-- --------------------------------------------------------

--
-- Table structure for table `barang_keluar`
--

CREATE TABLE `barang_keluar` (
  `no_transaksi` varchar(15) NOT NULL,
  `tanggal` date NOT NULL,
  `kode_barang` varchar(10) DEFAULT NULL,
  `jumlah` int(11) NOT NULL,
  `tujuan` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang_keluar`
--

INSERT INTO `barang_keluar` (`no_transaksi`, `tanggal`, `kode_barang`, `jumlah`, `tujuan`) VALUES
('TRX-OUT-001', '2023-01-05', 'EL-001', 2, 'Departemen IT - Kantor Pusat'),
('TRX-OUT-002', '2023-01-10', 'PK-002', 5, 'Divisi Maintenance'),
('TRX-OUT-003', '2023-01-15', 'AT-001', 50, 'HRD - Rekrutmen Karyawan Baru'),
('TRX-OUT-004', '2023-01-20', 'FR-002', 3, 'Kantor Cabang Surabaya'),
('TRX-OUT-005', '2023-02-01', 'KN-002', 25, 'Rapat Bulanan Manajemen'),
('TRX-OUT-006', '2023-02-10', 'EL-002', 1, 'Penggantian Monitor Rusak'),
('TRX-OUT-007', '2023-02-15', 'PK-001', 3, 'Tim Lapangan Proyek A'),
('TRX-OUT-008', '2023-02-20', 'AT-002', 30, 'Training Karyawan'),
('TRX-OUT-009', '2023-03-01', 'FR-001', 2, 'Kantor Cabang Bandung'),
('TRX-OUT-010', '2023-03-10', 'KN-001', 100, 'Acara Kantor Tahunan');

-- --------------------------------------------------------

--
-- Table structure for table `barang_masuk`
--

CREATE TABLE `barang_masuk` (
  `no_transaksi` varchar(15) NOT NULL,
  `tanggal` date NOT NULL,
  `kode_barang` varchar(10) DEFAULT NULL,
  `jumlah` int(11) NOT NULL,
  `kode_supplier` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang_masuk`
--

INSERT INTO `barang_masuk` (`no_transaksi`, `tanggal`, `kode_barang`, `jumlah`, `kode_supplier`) VALUES
('TRX-IN-001', '2023-01-03', 'EL-001', 5, 'S001'),
('TRX-IN-002', '2023-01-08', 'EL-002', 10, 'S001'),
('TRX-IN-003', '2023-01-12', 'PK-001', 20, 'S002'),
('TRX-IN-004', '2023-01-18', 'PK-002', 15, 'S002'),
('TRX-IN-005', '2023-01-25', 'AT-001', 100, 'S003'),
('TRX-IN-006', '2023-02-05', 'AT-002', 50, 'S003'),
('TRX-IN-007', '2023-02-12', 'FR-001', 8, 'S004'),
('TRX-IN-008', '2023-02-20', 'FR-002', 6, 'S004'),
('TRX-IN-009', '2023-03-01', 'KN-001', 200, 'S005'),
('TRX-IN-010', '2023-03-10', 'KN-002', 150, 'S005');

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `id` int(11) NOT NULL,
  `kode_kategori` varchar(10) NOT NULL,
  `nama_kategori` varchar(100) NOT NULL,
  `deskripsi` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`id`, `kode_kategori`, `nama_kategori`, `deskripsi`) VALUES
(1, 'K001', 'Elektronik', 'Barang-barang elektronik dan peralatan listrik'),
(2, 'K002', 'Perkakas', 'Alat-alat perkakas dan perbaikan'),
(3, 'K003', 'ATK', 'Alat Tulis Kantor dan perlengkapannya'),
(4, 'K004', 'Furniture', 'Perabotan dan mebel kantor'),
(5, 'K005', 'Konsumsi', 'Barang habis pakai dan makanan');

-- --------------------------------------------------------

--
-- Table structure for table `lokasi`
--

CREATE TABLE `lokasi` (
  `kode_lokasi` varchar(10) NOT NULL,
  `nama_lokasi` varchar(100) NOT NULL,
  `deskripsi` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `lokasi`
--

INSERT INTO `lokasi` (`kode_lokasi`, `nama_lokasi`, `deskripsi`) VALUES
('L001', 'Gudang Utama', 'Gudang pusat penyimpanan barang'),
('L002', 'Rak A1', 'Rak bagian A1 untuk barang elektronik'),
('L003', 'Rak B2', 'Rak bagian B2 untuk perkakas'),
('L004', 'Rak C3', 'Rak bagian C3 untuk ATK'),
('L005', 'Ruang Penyimpanan Khusus', 'Untuk barang-barang khusus dan berharga');

-- --------------------------------------------------------

--
-- Table structure for table `mutasi_barang`
--

CREATE TABLE `mutasi_barang` (
  `id_mutasi` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `kode_barang` varchar(10) DEFAULT NULL,
  `dari_lokasi` varchar(10) DEFAULT NULL,
  `ke_lokasi` varchar(10) DEFAULT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mutasi_barang`
--

INSERT INTO `mutasi_barang` (`id_mutasi`, `tanggal`, `kode_barang`, `dari_lokasi`, `ke_lokasi`, `jumlah`) VALUES
(1, '2023-01-04', 'EL-001', 'L001', 'L002', 2),
(2, '2023-01-09', 'EL-002', 'L001', 'L003', 3),
(3, '2023-01-14', 'PK-001', 'L002', 'L004', 5),
(4, '2023-01-20', 'PK-002', 'L002', 'L003', 4),
(5, '2023-01-26', 'AT-001', 'L003', 'L005', 20),
(6, '2023-02-06', 'AT-002', 'L003', 'L004', 10),
(7, '2023-02-14', 'FR-001', 'L004', 'L002', 2),
(8, '2023-02-21', 'FR-002', 'L004', 'L001', 1),
(9, '2023-03-02', 'KN-001', 'L005', 'L003', 50),
(10, '2023-03-11', 'KN-002', 'L005', 'L004', 30);

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id` int(11) NOT NULL,
  `kode_supplier` varchar(10) NOT NULL,
  `nama_supplier` varchar(100) NOT NULL,
  `alamat` text DEFAULT NULL,
  `telepon` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id`, `kode_supplier`, `nama_supplier`, `alamat`, `telepon`) VALUES
(1, 'S001', 'PT Sumber Elektronik', 'Jl. Raya Elektronik No. 123, Jakarta', '021-1234567'),
(2, 'S002', 'CV Perkakas Jaya', 'Jl. Industri No. 45, Bandung', '022-7654321'),
(3, 'S003', 'Toko ATK Maju', 'Jl. Pendidikan No. 67, Surabaya', '031-9876543'),
(4, 'S004', 'Furniture Indo', 'Jl. Mebel No. 89, Semarang', '024-5678912'),
(5, 'S005', 'Grosir Konsumsi', 'Jl. Pangan No. 34, Yogyakarta', '0274-3456789');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id_user` int(11) NOT NULL,
  `nama` varchar(25) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id_user`, `nama`, `username`, `password`, `role`) VALUES
(1, 'Admin Utama', 'admin', '$2a$10$647jSjH2YO4zOH98QDetjeJaQ4KA.Ngzd0iS0Eg0aMVXDwHzGXeRu', 'admin'),
(2, 'Manager Gudang', 'manager', '$2a$10$647jSjH2YO4zOH98QDetjeJaQ4KA.Ngzd0iS0Eg0aMVXDwHzGXeRu', 'manager'),
(3, 'Staff Gudang 1', 'staff1', '$2a$10$647jSjH2YO4zOH98QDetjeJaQ4KA.Ngzd0iS0Eg0aMVXDwHzGXeRu', 'user'),
(4, 'Staff Gudang 2', 'staff2', '$2a$10$647jSjH2YO4zOH98QDetjeJaQ4KA.Ngzd0iS0Eg0aMVXDwHzGXeRu', 'user'),
(5, 'Auditor Sistem', 'audit', '$2a$10$647jSjH2YO4zOH98QDetjeJaQ4KA.Ngzd0iS0Eg0aMVXDwHzGXeRu', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id`),
  ADD KEY `kode_lokasi` (`kode_lokasi`),
  ADD KEY `kode_barang` (`kode_barang`) USING BTREE,
  ADD KEY `kode_kategori` (`kode_kategori`) USING BTREE;

--
-- Indexes for table `barang_keluar`
--
ALTER TABLE `barang_keluar`
  ADD PRIMARY KEY (`no_transaksi`),
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Indexes for table `barang_masuk`
--
ALTER TABLE `barang_masuk`
  ADD PRIMARY KEY (`no_transaksi`),
  ADD KEY `kode_barang` (`kode_barang`),
  ADD KEY `kode_supplier` (`kode_supplier`);

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id`),
  ADD KEY `kode_kategori` (`kode_kategori`) USING BTREE;

--
-- Indexes for table `lokasi`
--
ALTER TABLE `lokasi`
  ADD KEY `kode_lokasi` (`kode_lokasi`) USING BTREE;

--
-- Indexes for table `mutasi_barang`
--
ALTER TABLE `mutasi_barang`
  ADD PRIMARY KEY (`id_mutasi`),
  ADD KEY `kode_barang` (`kode_barang`),
  ADD KEY `dari_lokasi` (`dari_lokasi`),
  ADD KEY `ke_lokasi` (`ke_lokasi`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id`),
  ADD KEY `kode_supplier` (`kode_supplier`) USING BTREE;

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `kategori`
--
ALTER TABLE `kategori`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `mutasi_barang`
--
ALTER TABLE `mutasi_barang`
  MODIFY `id_mutasi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `barang`
--
ALTER TABLE `barang`
  ADD CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`kode_kategori`) REFERENCES `kategori` (`kode_kategori`),
  ADD CONSTRAINT `barang_ibfk_2` FOREIGN KEY (`kode_lokasi`) REFERENCES `lokasi` (`kode_lokasi`);

--
-- Constraints for table `barang_keluar`
--
ALTER TABLE `barang_keluar`
  ADD CONSTRAINT `barang_keluar_ibfk_1` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`);

--
-- Constraints for table `barang_masuk`
--
ALTER TABLE `barang_masuk`
  ADD CONSTRAINT `barang_masuk_ibfk_1` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`),
  ADD CONSTRAINT `barang_masuk_ibfk_2` FOREIGN KEY (`kode_supplier`) REFERENCES `supplier` (`kode_supplier`);

--
-- Constraints for table `mutasi_barang`
--
ALTER TABLE `mutasi_barang`
  ADD CONSTRAINT `mutasi_barang_ibfk_1` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`),
  ADD CONSTRAINT `mutasi_barang_ibfk_2` FOREIGN KEY (`dari_lokasi`) REFERENCES `lokasi` (`kode_lokasi`),
  ADD CONSTRAINT `mutasi_barang_ibfk_3` FOREIGN KEY (`ke_lokasi`) REFERENCES `lokasi` (`kode_lokasi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
