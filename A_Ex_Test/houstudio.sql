SET SESSION FOREIGN_KEY_CHECKS=0;


/* Create Tables */

CREATE TABLE board
(
	bnum int NOT NULL AUTO_INCREMENT,
	title varchar(50),
	content varchar(2000),
	regdate datetime,
	moddate datetime,
	available_date datetime,
	-- ㅍ
	available_time varchar(50) COMMENT 'ㅍ',
	price int,
	people int,
	address varchar(100),
	phone_number varchar(20),
	cg_num int NOT NULL,
	email varchar(50) NOT NULL,
	PRIMARY KEY (bnum)
);


CREATE TABLE book_info
(
	booknum int(50) NOT NULL,
	usedate datetime,
	bnum int NOT NULL,
	email varchar(50) NOT NULL,
	PRIMARY KEY (booknum)
);


CREATE TABLE category
(
	cg_num int NOT NULL AUTO_INCREMENT,
	cg_name varchar(50),
	PRIMARY KEY (cg_num)
);


CREATE TABLE image
(
	img_num int(20) NOT NULL,
	img_name varchar(255),
	path varchar(255),
	uuid varchar(255),
	bnum int NOT NULL,
	PRIMARY KEY (img_num)
);


CREATE TABLE myboard
(
	bnum int NOT NULL,
	email varchar(50) NOT NULL
);


CREATE TABLE review
(
	reviewnum int(20) NOT NULL AUTO_INCREMENT,
	text varchar(255),
	grade int(10),
	review_regdate datetime,
	review_moddate datetime,
	bnum int NOT NULL,
	email varchar(50) NOT NULL,
	PRIMARY KEY (reviewnum)
);


CREATE TABLE user
(
	email varchar(50) NOT NULL,
	pw varchar(50) NOT NULL,
	nickname varchar(30) NOT NULL,
	PRIMARY KEY (email),
	UNIQUE (nickname)
);



/* Create Foreign Keys */

ALTER TABLE book_info
	ADD FOREIGN KEY (bnum)
	REFERENCES board (bnum)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE image
	ADD FOREIGN KEY (bnum)
	REFERENCES board (bnum)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE myboard
	ADD FOREIGN KEY (bnum)
	REFERENCES board (bnum)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE review
	ADD FOREIGN KEY (bnum)
	REFERENCES board (bnum)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE board
	ADD FOREIGN KEY (cg_num)
	REFERENCES category (cg_num)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE board
	ADD FOREIGN KEY (email)
	REFERENCES user (email)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE book_info
	ADD FOREIGN KEY (email)
	REFERENCES user (email)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE myboard
	ADD FOREIGN KEY (email)
	REFERENCES user (email)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE review
	ADD FOREIGN KEY (email)
	REFERENCES user (email)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



