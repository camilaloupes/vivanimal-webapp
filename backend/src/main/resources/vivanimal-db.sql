DROP DATABASE IF EXISTS vivanimal;
CREATE DATABASE vivanimal;
USE vivanimal;

DROP TABLE IF EXISTS animal;

CREATE TABLE animal (
    id            INT AUTO_INCREMENT PRIMARY KEY,
    name          VARCHAR(255),
    species       VARCHAR(255),
    age           INT,
    gender        VARCHAR(255),
    size          VARCHAR(255),
    status        BOOLEAN,
    picture       VARCHAR(255),
    description   TEXT
);


DELETE FROM animal;

INSERT INTO animal (name, species, age, gender, size, status, picture, description) VALUES
( 'Mi', 'cat', 1, 'male', 'small', false, 'https://utfs.io/f/ERRgUQg89ZpiC1t7KzN3jWSrTqEfgyNGXoFiA81b76zvJIYO', 'Muito amoroso e brincalhão, o Mi está esterelizado e com as vacinas atualizadas a espera do seu novo lar.'),
( 'Mãe', 'dog', 3, 'female', 'small', false, 'https://utfs.io/f/ERRgUQg89ZpiDTjArUd9ORFrA6oZix45Md0Bj7bsqtIGfXyw', 'Muito meiga a procura da sua nova família, não está esterelizada, mas podemos ajudar com isto.'),
( 'Filha', 'dog', 2, 'female', 'small', false, 'https://utfs.io/f/ERRgUQg89ZpiXX3sEwDz2xnaB9YcOkfQvjZhwW0tbUTNm1Iu', 'Muito meiga a procura da sua nova família, não está esterelizada, mas podemos ajudar com isto.'),
( 'Gatinho', 'cat', 2, 'male', 'small', false, 'https://utfs.io/f/ERRgUQg89ZpiWgTTKiBgv1D5MQR9aISYsO4NikVHbqrwXJGC', 'Muito simpático a procura da sua nova família, está esterelizado e vacinado'),
( 'Xano', 'dog', 4, 'male', 'medium', false, 'https://utfs.io/f/ERRgUQg89Zpi6CDTweio8QetaDvpu2xNlIcRdGOb9XH4hPfm', 'Um cão muito especial, sempre pronta para fazer alguem '),
( 'Monty', 'cat', 3, 'male', 'small', false, 'https://utfs.io/f/ERRgUQg89Zpiu5YU3ugnoxsGPKbtVIOAjdDCplHNgShri169', ' Monty é um jovem adulto que já está esterilzado e com as vacinas em dia.'),
( 'Hugo', 'dog', 8, 'male', 'medium', false, 'https://utfs.io/f/ERRgUQg89ZpiQBEsamVAL9JktlZO4K10dDIocTnRyGswue2p', 'o Hugo é um sobrevivente do incendio de Sto. Tirso, à procura de uma família que ama um cãozinho sénior'),
( 'Zero', 'cat', 0, 'male', 'small', false, 'https://utfs.io/f/ERRgUQg89ZpilzwMJFPCwLgIFljbTVhs350zRQJBZrmxSc7E', 'O Zero é um gatinho assustado, mas muito brincalhão, à procura da sua primeira família.'),
( 'Sousa', 'cat', 10, 'male', 'small', false, 'https://utfs.io/f/ERRgUQg89ZpiXnCqctDz2xnaB9YcOkfQvjZhwW0tbUTNm1Iu', 'O aposentado Sr. Sousa, é um gatinho sénior que procura seu último lar. Adopte um sénior.'),
( 'Bolt', 'dog', 2, 'male', 'large', false, 'https://utfs.io/f/ERRgUQg89Zpinc5aAEYLMIH6eDT1y3ZAic8x0YmgjXzq5K2W', 'O Bolt é um cão ainda muito jovem que tem muito amor para dar!'),
( 'Paulinha', 'dog', 5, 'female', 'large', false, 'https://utfs.io/f/ERRgUQg89ZpiRIYmIY4nH5jw73uUCT2doc4ksJXbx6y1B8hP', 'A Paulinha é uma cadela que adora os pequeninos, ela procura um lar cheio de amor e alegria.'),
( 'Alana', 'dog', 4, 'female', 'large', false, 'https://utfs.io/f/ERRgUQg89ZpiJYsi0NyQsE1UwTnBODkAhbR65MW4PoFHC7Vr', 'A Alana é muito amorosa, muito linda e está a procura da sua nova família.'),
( 'Ana', 'cat', 5, 'female', 'small', false, 'https://utfs.io/f/ERRgUQg89ZpiD1x4cKqd9ORFrA6oZix45Md0Bj7bsqtIGfXy', 'A Ana é uma gatinha linda que procura um lar cheio de amor e alegria.'),
( 'Moranguinha', 'cat', 3, 'female', 'small', false, 'https://utfs.io/f/ERRgUQg89Zpiin2JHsUrU452lxZM9X1WboSInvqNsGwPmFCH', 'A Moranguinha é uma gatinha linda que procura um lar cheio de amor e alegria.'),
( 'Natacha', 'cat', 6, 'female', 'small', false, 'https://utfs.io/f/ERRgUQg89ZpiEBWTO789ZpiUyW04tLPCfzgrV71cuKwIDNqY', 'A Natacha tem uma cor linda e rara e merece um lar cheio de amor.'),
( 'Borboleta', 'cat', 3, 'female', 'small', false, 'https://utfs.io/f/ERRgUQg89ZpizVeXQ7zmf8jvGRJHBrs1xqawmd4ZlIDetpTn', 'A Borboleta é uma das gatinhas mais amorosas do Vivanimal, e apesar disso ainda não encontrou a sua nova família, será que é a tua'),
( 'Frida', 'cat', 4, 'female', 'small', false, 'https://utfs.io/f/ERRgUQg89ZpiQg6c4X1VAL9JktlZO4K10dDIocTnRyGswue2', 'A Frida é uma gatinha muito curiosa que procura um lar cheio de amor e alegria.');