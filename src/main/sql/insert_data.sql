-- displays
insert into shipments
values (152523, 100,'2020.12.01','10 days' , 500);
insert into shipments
values (152524, 100,'2020.12.01','10 days' , 500);
insert into shipments
values (152525, 100,'2020.12.01','10 days' , 500);
insert into shipments
values (152526, 100,'2020.12.01','10 days' , 500);
insert into shipments
values (152527, 100,'2020.12.01','10 days' , 500);
insert into shipments
values (152528, 100,'2020.12.01','10 days' , 500);
insert into displays
values ('Dell 15.6 IPS', 1, 156, '1920x1080', 'IPS', 152523, 3000);

insert into displays
values ('Dell 15.6 TFT', 2, 156, '1920x1080', 'TFT', 152524, 1500);

insert into displays
values ('Dell 13 IPS', 3, 133, '1920x1080', 'IPS', 152525, 2500);

insert into displays
values ('Dell 13 TFT', 4, 133, '1920x1080', 'TFT', 152526, 1200);

insert into displays
values ('Dell 17.3 IPS', 5, 173, '1920x1080', 'IPS', 152527, 3500);

insert into displays
values ('Dell 17.3 TFT', 6, 173, '1920x1080', 'TFT', 152528, 1800);

--gpus

insert into shipments
values (285295, 100,'2020.12.01', '10 days' , 500);
insert into shipments
values (285296, 100,'2020.12.01', '10 days' , 500);
insert into shipments
values (285297, 100,'2020.12.01', '10 days' , 500);
insert into gpus
values ('Nvidia GeForce RTX 2060', 1, 1800, 9000, 8, 285295, 20000, 160);

insert into gpus
values ('Nvidia GeForce RTX 2050', 2, 1500, 8000, 6, 285296, 16000, 120);

insert into gpus
values ('Nvidia GeForce RTX 2070', 3, 1900, 12000, 12, 285297, 30000, 190);

-- ram

insert into shipments
values (957286, 100, '2020.12.01', '10 days', 500);

insert into shipments
values (957287, 100, '2020.12.01', '10 days', 500);

insert into shipments
values (957288, 100, '2020.12.01', '10 days', 500);

insert into shipments
values (957289, 100, '2020.12.01', '10 days', 500);

insert into ram
values ('Corsair Pro', 1, 'DDR4', 8, 'SO-DIMM', 2400, 957286, 3000);

insert into ram
values ('Corsair Pro', 2, 'DDR4', 4, 'SO-DIMM', 2400, 957287, 3000);

insert into ram
values ('Corsair Pro', 3, 'DDR4', 8, 'DIMM', 2400, 957288, 1800);

insert into ram
values ('Corsair Pro', 4, 'DDR4', 4, 'DIMM', 2400, 957289, 1800);

-- drives
insert into shipments
values (963741, 100, '2020.12.01', '10 days', 500);

insert into shipments
values (963742, 100, '2020.12.01', '10 days', 500);

insert into shipments
values (963743, 100, '2020.12.01', '10 days', 500);

insert into shipments
values (963744, 100, '2020.12.01', '10 days', 500);

insert into shipments
values (963745, 100, '2020.12.01', '10 days', 500);

insert into shipments
values (963746, 100, '2020.12.01', '10 days', 500);

insert into shipments
values (963747, 100, '2020.12.01', '10 days', 500);

insert into drives
values ('WD Blue SSD', 1, true, 128, 120, 50, 963741, 2200);

insert into drives
values ('WD Blue SSD', 2, true, 256, 160, 70, 963742, 4000);

insert into drives
values ('WD Blue SSD', 3, true, 512, 200, 90, 963743, 8000);

insert into drives
values ('WD Blue SSD', 4, true, 1024, 250, 120, 963744, 15000);


insert into drives
values ('WD Blue', 5, false, 1000, 40, 12, 963745, 2500);

insert into drives
values ('WD Blue', 6, false, 2000, 50, 15, 963746, 4000);

insert into drives
values ('WD Blue', 7, false, 4000, 60, 18, 963747, 6000);
-- cpus

insert into shipments
values (567249, 100, '2020.12.01', '10 days', 500);
insert into shipments
values (567250, 100, '2020.12.01', '10 days', 500);
insert into shipments
values (567251, 100, '2020.12.01', '10 days', 500);

insert into cpus
values ('AMD Ryzen 5 3600U', 1, null, 3200, 6, 567249, 12000, 25);

insert into cpus
values ('AMD Ryzen 3 3400U', 2, null, 3000, 4, 567250, 9000, 15);

insert into cpus
values ('AMD Ryzen 7 3700U', 3, null, 3500, 8, 567251, 16000, 45);

-- bases

insert into shipments
values (127829, 100, '2020.12.01', '10 days', 500);

insert into shipments
values (127830, 100, '2020.12.01', '10 days', 500);

insert into shipments
values (127831, 100, '2020.12.01', '10 days', 500);

insert into bases
values ('Dell XPS 13', 1, false, 2, 1, 127829, 4000, 133, 'https://sun9-61.userapi.com/impg/eE_2_s7a1BvveC96E7WQVqO2H663byh1KKHF1w/ChHwvDQLbgs.jpg?size=2400x1372&quality=96&proxy=1&sign=d16c4a3ccc337911d027a197bfa0af01&type=album', 25, 150, 'SO-DIMM');

insert into bases
values ('Dell XPS 15', 2, true, 2, 2, 127830, 4000, 156, 'https://www.macroget.com/cdn/2020/01/VIYxPtSq.jpg', 45, 160, 'DIMM');

insert into bases
values ('Dell XPS 17', 3, true, 2, 2, 127831, 4000, 173, 'https://sun9-28.userapi.com/impg/8B6mAJo3G9abZZAeQC0YAcwXRcN_680NFzSUQA/qLckDmzJL54.jpg?size=2000x2000&quality=96&proxy=1&sign=3ebb0af8ace10064542501cadd8aee12&type=album', 45, 200, 'DIMM');


-- other


insert into customers
values (1, 'John', 'Doe');

insert into builds
values (1, 1, 1, 1, 1, 1, 1);

insert into buckets
values (1, 1, 2);

insert into orders
values (1, 'Received', 1, '197384', 1, 2);

insert into agents
values (1, '9003d1df22eb4d3820015070385194c8');