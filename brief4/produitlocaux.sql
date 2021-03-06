PGDMP         '                z            Produits_locaux    14.3    14.3                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16394    Produits_locaux    DATABASE     u   CREATE DATABASE "Produits_locaux" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_United States.1252';
 !   DROP DATABASE "Produits_locaux";
                postgres    false            ?            1259    16440    admins    TABLE     S   CREATE TABLE public.admins (
    admin_id integer NOT NULL,
    user_id integer
);
    DROP TABLE public.admins;
       public         heap    postgres    false            ?            1259    16430    clients    TABLE     U   CREATE TABLE public.clients (
    client_id integer NOT NULL,
    user_id integer
);
    DROP TABLE public.clients;
       public         heap    postgres    false            ?            1259    16450    produits    TABLE     ?   CREATE TABLE public.produits (
    produit_id integer NOT NULL,
    nom character varying(50),
    prix integer,
    quantite integer,
    la_date date,
    user_id integer
);
    DROP TABLE public.produits;
       public         heap    postgres    false            ?            1259    16425    users    TABLE     ?   CREATE TABLE public.users (
    user_id integer NOT NULL,
    nom character varying(50),
    prenom character varying(50),
    adress character varying(255)
);
    DROP TABLE public.users;
       public         heap    postgres    false            ?            1259    16465    votes    TABLE     ?   CREATE TABLE public.votes (
    produit_vote character varying(10),
    client_id integer NOT NULL,
    produit_id integer NOT NULL
);
    DROP TABLE public.votes;
       public         heap    postgres    false                      0    16440    admins 
   TABLE DATA           3   COPY public.admins (admin_id, user_id) FROM stdin;
    public          postgres    false    211   C                 0    16430    clients 
   TABLE DATA           5   COPY public.clients (client_id, user_id) FROM stdin;
    public          postgres    false    210   j                 0    16450    produits 
   TABLE DATA           U   COPY public.produits (produit_id, nom, prix, quantite, la_date, user_id) FROM stdin;
    public          postgres    false    212   ?                 0    16425    users 
   TABLE DATA           =   COPY public.users (user_id, nom, prenom, adress) FROM stdin;
    public          postgres    false    209   ?       	          0    16465    votes 
   TABLE DATA           D   COPY public.votes (produit_vote, client_id, produit_id) FROM stdin;
    public          postgres    false    213   (       p           2606    16444    admins admins_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.admins
    ADD CONSTRAINT admins_pkey PRIMARY KEY (admin_id);
 <   ALTER TABLE ONLY public.admins DROP CONSTRAINT admins_pkey;
       public            postgres    false    211            n           2606    16434    clients clients_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.clients
    ADD CONSTRAINT clients_pkey PRIMARY KEY (client_id);
 >   ALTER TABLE ONLY public.clients DROP CONSTRAINT clients_pkey;
       public            postgres    false    210            r           2606    16454    produits produits_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.produits
    ADD CONSTRAINT produits_pkey PRIMARY KEY (produit_id);
 @   ALTER TABLE ONLY public.produits DROP CONSTRAINT produits_pkey;
       public            postgres    false    212            l           2606    16429    users users_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (user_id);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    209            t           2606    16469    votes votes_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.votes
    ADD CONSTRAINT votes_pkey PRIMARY KEY (client_id, produit_id);
 :   ALTER TABLE ONLY public.votes DROP CONSTRAINT votes_pkey;
       public            postgres    false    213    213            v           2606    16445    admins admins_user_id_fkey    FK CONSTRAINT     ~   ALTER TABLE ONLY public.admins
    ADD CONSTRAINT admins_user_id_fkey FOREIGN KEY (user_id) REFERENCES public.users(user_id);
 D   ALTER TABLE ONLY public.admins DROP CONSTRAINT admins_user_id_fkey;
       public          postgres    false    211    3180    209            u           2606    16435    clients clients_user_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.clients
    ADD CONSTRAINT clients_user_id_fkey FOREIGN KEY (user_id) REFERENCES public.users(user_id);
 F   ALTER TABLE ONLY public.clients DROP CONSTRAINT clients_user_id_fkey;
       public          postgres    false    3180    209    210            w           2606    16455    produits produits_user_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.produits
    ADD CONSTRAINT produits_user_id_fkey FOREIGN KEY (user_id) REFERENCES public.users(user_id);
 H   ALTER TABLE ONLY public.produits DROP CONSTRAINT produits_user_id_fkey;
       public          postgres    false    3180    212    209            x           2606    16470    votes votes_client_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.votes
    ADD CONSTRAINT votes_client_id_fkey FOREIGN KEY (client_id) REFERENCES public.clients(client_id);
 D   ALTER TABLE ONLY public.votes DROP CONSTRAINT votes_client_id_fkey;
       public          postgres    false    213    210    3182            y           2606    16475    votes votes_produit_id_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.votes
    ADD CONSTRAINT votes_produit_id_fkey FOREIGN KEY (produit_id) REFERENCES public.produits(produit_id);
 E   ALTER TABLE ONLY public.votes DROP CONSTRAINT votes_produit_id_fkey;
       public          postgres    false    212    213    3186                  x?34?4?22?4?????? #?            x?31?4?????? ?X         (   x?35?t,JO??422??0?4202?50"N?=... }1L         T   x???	? ?s2????_(??)????ߋ??%SAי+ٔ?Ή?Ag??u??5>)le\Y?v¸т?t?sc??Q?      	      x?+?/?,?,K?41?45?????? D-	     