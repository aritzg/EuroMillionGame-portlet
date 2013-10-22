create table EuroMillionGame_Draw (
	drawId LONG not null primary key,
	number1 INTEGER,
	number2 INTEGER,
	number3 INTEGER,
	number4 INTEGER,
	number5 INTEGER,
	star1 INTEGER,
	star2 INTEGER,
	number1Guess INTEGER,
	number2Guess INTEGER,
	number3Guess INTEGER,
	number4Guess INTEGER,
	number5Guess INTEGER,
	star1Guess INTEGER,
	star2Guess INTEGER,
	drawDate DATE null,
	modifyDate DATE null
);

create table EuroMillionGame_GoogleDevice (
	googleDeviceId LONG not null primary key,
	emailAddress VARCHAR(75) null,
	registrationId VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table EuroMillionGame_Proposal (
	proposalId LONG not null primary key,
	drawId LONG,
	emailAddress VARCHAR(75) null,
	number1 INTEGER,
	number2 INTEGER,
	number3 INTEGER,
	number4 INTEGER,
	number5 INTEGER,
	star1 INTEGER,
	star2 INTEGER,
	type_ VARCHAR(75) null,
	statisticalPopulation LONG,
	winnings DOUBLE,
	createDate DATE null,
	modifyDate DATE null
);