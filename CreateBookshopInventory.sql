DROP TABLE IF EXISTS stocktbl;
DROP TABLE IF EXISTS userlogintbl;
DROP TABLE IF EXISTS purchasetbl;

CREATE TABLE stocktbl
(
	bookshop_item TEXT PRIMARY KEY,
	quantity INTEGER NOT NULL,
	price REAL NOT NULL
);

CREATE TABLE purchasetbl
(
	id SERIAL PRIMARY KEY,
	username TEXT NOT NULL,
	bookshop_item TEXT NOT NULL,
	quantity INTEGER NOT NULL,
	price REAL NOT NULL
);

CREATE TABLE userlogintbl
(	
	username TEXT PRIMARY KEY,
	address TEXT NOT NULL,
	pass TEXT NOT NULL
);