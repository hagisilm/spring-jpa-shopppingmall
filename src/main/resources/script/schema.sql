create table if not exists Categories (
                            CategoryID		INT	auto_increment,
                            CategoryName	varchar(50),

                            CONSTRAINT pk_Categories PRIMARY KEY(CategoryID)
);

create table if not exists Products (
                          ProductID	INT	auto_increment,
                          CategoryID	INT,
                          ModelNumber	nvarchar(10),
                          ModelName	nvarchar(120),
                          ProductImage	nvarchar(30),
                          UnitCost	decimal(15),
                          Description	text,

                          CONSTRAINT pk_Products PRIMARY KEY(ProductID),
                          CONSTRAINT fk_Products_Categories FOREIGN KEY(CategoryID) REFERENCES Categories(CategoryID)
);

create table if not exists Customers (
                           CustomerID	int auto_increment,
                           Name	varchar(10),
                           EmailAddress varchar(100)	UNIQUE,
                           Password	varchar(12),

                           CONSTRAINT pk_Customer PRIMARY KEY(CustomerID)
);

create table if not exists Reviews (
                         ReviewID	int auto_increment,
                         ProductID	int,
                         CustomerID	int,
                         Rating		int,
                         Comments	text,

                         CONSTRAINT pk_ReviewID PRIMARY KEY(ReviewID),
                         CONSTRAINT fk_Review_Products FOREIGN KEY(ProductID) REFERENCES Products(ProductID),
                         CONSTRAINT fk_Review_Customer FOREIGN KEY(CustomerID) REFERENCES Customers(CustomerID)
);

create table if not exists Orders (
                        OrderID		int auto_increment,
                        CustomerID	int,
                        OrderDate	Datetime,
                        ShipDate	Datetime,

                        CONSTRAINT pk_Orders PRIMARY KEY(OrderID),
                        CONSTRAINT fk_Orders_CustomerID FOREIGN KEY(CustomerID) REFERENCES Customers(CustomerID)
);

create table if not exists OrderDetails (
                              OrderID	int,
                              ProductID	int,
                              Quantity	int,
                              UnitCost	decimal(15),

                              CONSTRAINT pk_OrderDetails PRIMARY KEY(OrderID, ProductID),
                              CONSTRAINT fk_OrderDetails_Orders FOREIGN KEY(OrderID) REFERENCES Orders(OrderID),
                              CONSTRAINT fk_OrderDetails_Products FOREIGN KEY(ProductID) REFERENCES Products(ProductID)
);

create table if not exists ShoppingCart (
                              RecordID	int	auto_increment,
                              CartID		nvarchar(150),
                              Quantity	int,
                              ProductID	int,
                              DateCreated	Datetime DEFAULT NOW(),

                              CONSTRAINT pk_RecordID PRIMARY KEY(RecordID),
                              CONSTRAINT fk_cart_ProductID FOREIGN KEY(ProductID) REFERENCES Products(ProductID)
);