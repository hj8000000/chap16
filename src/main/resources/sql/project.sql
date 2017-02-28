--
-- Employee
--
select count(*) from dept;
select count(*) from emp;
select count(*) from bonus;
select count(*) from salgrade;

select * from emp;
select * from dept;
select * from bonus;
select * from salgrade;

--
-- World
--
select count(*) from country;
select count(*) from city;
select count(*) from country_language;

select * from country where code='USA';
select * from city where countrycode='USA';
select * from country_language where countrycode='USA';

select * from city;
select * from country_language;
drop table city;
drop table country;
drop table countrylanguage;

create table country (
	code 			char(3 char),							
	name 			char(52 char),							
	continent		char(20 char)	default 'Asia',			
	region			char(26 char),							
	surface_area	number(10,2)	default '0.00',			
	indep_year		number(6),								
	population		number(11)		default 0,				
	life_expectancy	number(3,1),						
	gnp				number(10,2),
	gnp_old			number(10,2),
	local_name		char(45 char),							
	government_form	char(45 char),							
	head_of_state	char(60 char)	default null,			
	capital			number(11)		default null,			
	code2			char(2  char),							
	constraint ck_continent check (continent in ('Asia','Europe','North America','Africa','Oceania','Antarctica','South America')),
	constraint pk_country primary key (code)
);

create table city (
	id					number(11)		not null,
	name				char(35 char),
	country_code 		char(3 char),
	district			char(20 char),
	population			number(11)		default 0,
	constraint pk_city primary key (id),
	constraint fk_country foreign key (country_code) references country(code) 
);

/*
 * CountryLanguage
 */
create table country_language (
	country_code		char(3 char),
	language			char(30 char),
	is_official			char(1 char)		default 'F',
	percentage			number(4,1)			default '0.0',
	constraint ck_is_official check (is_official in ('T','F')),
	constraint pk_country_language primary key (country_code, language)
);