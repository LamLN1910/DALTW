USE timphong;
DROP TABLE IF EXISTS phong;
DROP TABLE IF EXISTS hinhanh;
DROP TABLE IF EXISTS dathen;
DROP TABLE IF EXISTS danhgia;
DROP TABLE IF EXISTS taikhoan;
DROP TABLE IF EXISTS loaiphong;

CREATE TABLE taikhoan(
	id_tk INT AUTO_INCREMENT PRIMARY KEY,
	tentk NVARCHAR(30) NOT NULL UNIQUE,
	matkhau NVARCHAR(30) NOT NULL,
	quyen INT NOT NULL,
	email NVARCHAR(40) NOT NULL UNIQUE,
	sdt NVARCHAR(10) NOT NULL UNIQUE,
	ho NVARCHAR(10) NOT NULL,
	ten NVARCHAR(30) NOT NULL,
	anhdaidien VARCHAR(100)
);

CREATE TABLE loaiphong(
	id_lp INT AUTO_INCREMENT PRIMARY KEY,
	tenloai NVARCHAR(30) NOT NULL
);

CREATE TABLE phong(
	id_p INT AUTO_INCREMENT PRIMARY KEY,
	ten NVARCHAR(100) NOT NULL,
	anhchinh nvarchar(100) unique,
	trangthai INT NOT NULL,
	chieudai FLOAT NOT NULL,
	chieurong FLOAT NOT NULL,
	gia INT NOT NULL,
	songuoi INT,
	dcchitiet NVARCHAR(100) NOT NULL,
	mota NVARCHAR(500),
	ngaydang DATE,
	id_lp INT,
    FOREIGN KEY (id_lp) REFERENCES loaiphong(id_lp)
	on delete set null,
	id_x BIGINT,
    FOREIGN KEY (id_x) REFERENCES XaPhuong(ID)
	on delete set null,
	id_tk INT,
    FOREIGN KEY (id_tk) REFERENCES taikhoan(id_tk)
	on delete cascade
);

CREATE TABLE hinhanh(
	id_p int,
	stt int AUTO_INCREMENT,
	hinhanh nvarchar(100),
	PRIMARY KEY (stt, id_p, hinhanh),
	CONSTRAINT FK_hinhanh_p FOREIGN KEY (id_p) REFERENCES phong(id_p)
	on delete cascade
);

CREATE TABLE dathen(
	id_dh INT AUTO_INCREMENT,
	id_tk INT NOT NULL,
	id_p INT NOT NULL,
	trangthai INT,
	ngay DATE,
	gio TIME,
	PRIMARY KEY (id_dh, id_tk, id_p),
	CONSTRAINT FK_dathen_taikhoan FOREIGN KEY (id_tk) REFERENCES taikhoan(id_tk),
	CONSTRAINT FK_dathen_phong FOREIGN KEY (id_p) REFERENCES phong(id_p)
	on delete cascade
);

create table danhgia(
	id_dg int AUTO_INCREMENT,
	id_p int not null,
	id_tk int not null,
	ngay date,
	sosao float,
	noidung nvarchar(300),
	PRIMARY KEY (id_dg, id_tk, id_p),
	CONSTRAINT FK_danhgia_taikhoan FOREIGN KEY (id_tk) REFERENCES taikhoan(id_tk),
	CONSTRAINT FK_danhgia_phong FOREIGN KEY (id_p) REFERENCES phong(id_p)
	on delete cascade
)