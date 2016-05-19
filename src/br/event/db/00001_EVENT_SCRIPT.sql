-- -----------------------------------------------------
-- Table `event_e`.`tb_evento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS TB_EVENTO(
  `ID_EVENTO` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `NOME` TINYTEXT NOT NULL COMMENT '',
  `SIGLA` TINYTEXT NULL DEFAULT NULL COMMENT '',
  `DESCRICAO` TEXT NULL DEFAULT NULL COMMENT '',
  `DT_INICIO` INT(11) NOT NULL COMMENT '',
  `DT_FIM` INT(11) NOT NULL COMMENT '',
  `DT_CADASTRO` INT(11) NOT NULL COMMENT '',
  `DT_ALTERACAO` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`ID_EVENTO`)  COMMENT '')
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `event_e`.`tb_sub_evento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS TB_SUB_EVENTO (
  `ID_SUB_EVENTO` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `ID_EVENTO` INT(11) NOT NULL COMMENT '',
  `NOME` TINYTEXT NOT NULL COMMENT '',
  `SIGLA` TINYTEXT NULL DEFAULT NULL COMMENT '',
  `DESCRICAO` TEXT NULL DEFAULT NULL COMMENT '',
  `DT_INICIO` INT(11) NOT NULL COMMENT '',
  `DT_FIM` INT(11) NOT NULL COMMENT '',
  `DT_CADASTRO` INT(11) NOT NULL COMMENT '',
  `DT_ALTERACAO` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`ID_SUB_EVENTO`)  COMMENT '',
  INDEX `FK_EVENTO_idx` (`ID_EVENTO` ASC)  COMMENT '',
  CONSTRAINT `FK_EVENTO`
    FOREIGN KEY (`ID_EVENTO`)
    REFERENCES `event_e`.`TB_EVENTO` (`ID_EVENTO`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `event_e`.`tb_local`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS TB_LOCAL (
  `ID_LOCAL` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `PREDIO` TINYTEXT NULL DEFAULT NULL COMMENT '',
  `TIPO` TINYTEXT NOT NULL COMMENT '',
  `qntLUGARES` INT(11) NULL DEFAULT NULL COMMENT '',
  `LOCAL` TEXT NOT NULL COMMENT '',
  `DT_CADASTRO` INT(11) NOT NULL COMMENT '',
  `DT_ALTERACAO` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`ID_LOCAL`)  COMMENT '')
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `event_e`.`tb_atividade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS TB_ATIVIDADE (
  `ID_ATIVIDADE` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `ID_LOCAL` INT(11) NOT NULL COMMENT '',
  `ID_SUB_EVENTO` INT(11) NOT NULL COMMENT '',
  `SIGLA` TINYTEXT NULL DEFAULT NULL COMMENT '',
  `TIPO` TINYTEXT NULL DEFAULT NULL COMMENT '',
  `TITULO` TINYTEXT NOT NULL COMMENT '',
  `DESCRICAO` TEXT NULL DEFAULT NULL COMMENT '',
  `DATA` INT(11) NOT NULL COMMENT '',
  `HORA_INICIO` INT(11) NOT NULL COMMENT '',
  `HORA_FIM` INT(11) NOT NULL COMMENT '',
  `DT_CADASTRO` INT(11) NOT NULL COMMENT '',
  `DT_ALTERACAO` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`ID_ATIVIDADE`)  COMMENT '',
  INDEX `FK_SUB_EVENTO_idx` (`ID_SUB_EVENTO` ASC)  COMMENT '',
  INDEX `FK_LOCAL_idx` (`ID_LOCAL` ASC)  COMMENT '',
  CONSTRAINT `FK_SUB_EVENTO`
    FOREIGN KEY (`ID_SUB_EVENTO`)
    REFERENCES `event_e`.`TB_SUB_EVENTO` (`ID_SUB_EVENTO`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_LOCAL`
    FOREIGN KEY (`ID_LOCAL`)
    REFERENCES `event_e`.`TB_LOCAL` (`ID_LOCAL`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `event_e`.`tb_atualizacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS TB_ATUALIZACAO (
  `ID_ATUALIZACAO` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `DT_ULTIMA_ATUALIZACAO` INT(11) NOT NULL COMMENT '',
  `QTD_REGISTROS_ATUALIZADOS` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`ID_ATUALIZACAO`)  COMMENT '')
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `event_e`.`tb_login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS TB_LOGIN (
  `ID_LOGIN` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `USUARIO` TINYTEXT NOT NULL COMMENT '',
  `SENHA` TINYTEXT NOT NULL COMMENT '',
  PRIMARY KEY (`ID_LOGIN`)  COMMENT '')
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `event_e`.`tb_noticias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS TB_NOTICIAS (
  `ID_NOTICIA` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `TITULO` TINYTEXT NULL DEFAULT NULL COMMENT '',
  `TEXTO` TINYTEXT NOT NULL COMMENT '',
  `DT_CADASTRO` INT(11) NOT NULL COMMENT '',
  `DT_ALTERACAO` INT(11) NOT NULL COMMENT '',
  `STATUS` TEXT NULL DEFAULT NULL COMMENT '',
  PRIMARY KEY (`ID_NOTICIA`)  COMMENT '')
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `event_e`.`tb_palestrante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS TB_PALESTRANTE (
  `ID_PALESTRANTE` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `NOME` TINYTEXT NULL DEFAULT NULL COMMENT '',
  `EMAIL` TINYTEXT NOT NULL COMMENT '',
  `DT_CADASTRO` INT(11) NOT NULL COMMENT '',
  `DT_ALTERACAO` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`ID_PALESTRANTE`)  COMMENT '')
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `event_e`.`TB_PALESTRANTE_ATIVIDADE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS TB_PALESTRANTE_ATIVIDADE (
  `ID_PALESTRANTE_ATIVIDADE` INT(11) NOT NULL COMMENT '',
  `ID_PALESTRANTE` INT(11) NOT NULL COMMENT '',
  `ID_ATIVIDADE` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`ID_PALESTRANTE_ATIVIDADE`)  COMMENT '',
  INDEX `FK_PALESTRANTE_idx` (`ID_PALESTRANTE` ASC)  COMMENT '',
  INDEX `FK_ATIVIDADE_idx` (`ID_ATIVIDADE` ASC)  COMMENT '',
  CONSTRAINT `FK_PALESTRANTE`
    FOREIGN KEY (`ID_PALESTRANTE`)
    REFERENCES `event_e`.`TB_PALESTRANTE` (`ID_PALESTRANTE`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_ATIVIDADE`
    FOREIGN KEY (`ID_ATIVIDADE`)
    REFERENCES `event_e`.`TB_ATIVIDADE` (`ID_ATIVIDADE`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- Insert de teste para o DB
INSERT INTO `TB_EVENTO` (ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (1,'XXXVI Congresso da Sociedade Brasileira de Computação','CSBC 2016','A Computação é uma área em constante evolução, que se constitui em um elemento estratégico para o crescimento econômico e social de todos os países. Por isso, requer planejamento, investimento e intensificação da formação de profissionais qualificados para atender � s demandas da sociedade.
Desta forma, o Congresso da Sociedade Brasileira de Computação 2016 promoverá espaços para trocas, discussões e construções na comunidade, de maneira a aumentar a sinergia na busca de soluções efetivamente interdisciplinares para os complexos problemas que emergem na sociedade atual. Sociedade esta na qual as portas do conhecimento estão abertas e interconectadas, demonstrando a necessidade do trabalho conjunto em detrimento da ênfase na hiperespecialização.',1467590401,1467676801,1462898085,1462898085);

INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (1,1,'43 Seminário Integrado de Software e Hardware','SEMISH','O SEMISH, principal fórum científico do Congresso da Sociedade Brasileira de Computação (CSBC), está em sua quadragésima terceira edição e ocorrerá em Porto Alegre, nos dias 4 e 5 de julho, juntamente com o XXXVI CSBC. Este ano o Congresso da SBC discutirá "Computação e Interdisciplinaridade". O SEMISH 2016 acompanhará essa temática, tendo como base os documentos norteadores oriundos das discussões, na SBC, sobre os Grandes Desafios da Computação no Brasil [1, 2, 3]. Nesse sentido, convidamos a comunidade a compartilhar experiências por meio da submissão de artigos completos, em português ou inglês, que descrevam soluções que avancem o estado-da-arte ou apresentem direções de pesquisa efetivamente interdisciplinares para os problemas complexos que emergem na sociedade atual. Domínios de interesse incluem, por exemplo, Saúde, Educação, Segurança, Energia, Recuperação de Catástrofes e Mobilidade Urbana. Reiteramos que essa lista é apenas ilustrativa, e que o SEMISH está aberto para receber artigos que enfatizem outros tópicos que, de alguma forma, se enquadrem no âmbito Computação e Interdisciplinaridade.',1467631800,1467756000,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (2,1,'I ETC - ENCONTRO DE TEORIA DA COMPUTAÇÃO','ETC','O I Encontro de Teoria da Computação (ETC 2016) é um fórum voltado para a grande área de Teoria da Computação, sendo proposto por membros da Comissão Especial em Algoritmos, Combinatória e Otimização (CE-ACO), com objetivo de promover uma maior divulgação da área para a comunidade brasileira de computação e afins, através do principal evento da SBC, o XXXVI CSBC (Congresso da Sociedade Brasileira de Computação).
Este evento é  voltado para os alunos em formação, mas também visando proporcionar uma maior integração entre os pesquisadores e profissionais que atuam na mesma, seja com enfoque em teoria pura ou em aplicações, estimulando a discussão da importância dos fundamentos da computação e sua aplicação direta no entendimento e resolução de problemas das mais diversas áreas e segmentos de mercado.',1467631800,1467669600,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (3,1,'29º CTD - Concurso de Teses e Dissertações','CTD','O XXIX Concurso de Teses e Dissertações (CTD) do CSBC selecionará e premiará as melhores teses de doutorado e dissertações de mestrado da área de Computação do país concluídas, defendidas e aprovadas, no período de 1º de janeiro a 31 de dezembro de 2015. As teses e dissertações que concorrerem nesta edição serão avaliadas de acordo com os resultados científicos e tecnológicos já gerados pelo trabalho, assim como pelo seu potencial de impacto na sociedade e no estado da arte na área de Computação.',1467631800,1467734400,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (4,1,'35a JAI 2016 - Jornada de Atualização em Informática','JAI','A Jornada de Atualização em Informática (JAI) é um dos mais importantes eventos acadêmicos de atualização científica e tecnológica da comunidade de Computação do Brasil. Tradicionalmente realizada em conjunto com o Congresso da SBC – que em 2016 acontecerá em Porto Alegre de 4 a 7 de julho –, a JAI compreende trabalhos de pesquisadores sêniores da nossa comunidade, oferecendo uma oportunidade única para acadêmicos e profissionais de informática atualizarem-se em temas diversos, interagindo com líderes das mais diversas áreas de pesquisa no Brasi',1467631800,1467928800,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (5,1,'WEI''2016 - XXIV Workshop sobre Educação em Computação','WEI','O WEI é um evento anual promovido pela Sociedade Brasileira de Computação (SBC) com o objetivo de ser um fórum de debates sobre diferentes temas relacionados ao ensino e �  aprendizagem de Computação. O WEI constitui-se em um importante fórum brasileiro para apresentações de trabalhos científicos, reuniões e debates entre professores, estudantes, coordenadores de cursos e demais interessados na melhoria da educação em Computação. No contexto da Educação em Computação, precisamos repensar nossos modos de ensinar e de aprender utilizando métodos, técnicas e ferramentas capazes de favorecer a construção de conhecimento no âmbito da Computação.',1467631800,1467756000,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (6,1,'XVI Workshop de Informática Médica (WIM 2016)','WIM','O XVI Workshop de Informática Médica (WIM 2016) tem como objetivo reunir, no âmbito da Sociedade Brasileira de Computação (SBC), pesquisadores, estudantes, professores, empresários e profissionais interessados em Computação aplicada �  Saúde. O WIM 2016 será realizado nos dias 04 e 06 de julho de 2016 como parte dos eventos do XXXVI Congresso da Sociedade Brasileira de Computação (CSBC), em Porto Alegre, RS. O WIM é o evento anual da Comissão Especial de Computação Aplicada �  Saúde (CE-CAS) da SBC.
As atividades no WIM compreendem apresentação de artigos completos e artigos resumidos relatando trabalhos em andamento, além de palestras convidadas e mesas-redondas, distribuídas ao longo de três dias do CSBC.',1467631800,1467820800,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (8,1,'WCAMA 2016 – VII Workshop de Computação Aplicada �  Gestão do Meio Ambiente e Recursos Naturais','WCAMA','O workshop abrange toda as áreas de pesquisas e aplicações em metodologias, técnicas e ferramentas computacionais aplicadas �  gestão do meio ambiente e dos recursos naturais, incluindo (mas não limitado a):
Áreas alagadas e várzeas
Áreas prioritárias �  conservação
Controle da poluição do ar
Ecologia de paisagem
Ecologia urbana
Fragilidade ambiental
Gerenciamento de lixo sólido
Gerenciamento de recursos naturais e renováveis
Modelagem de distribuição de espécies
Modelagem de mudança de uso e cobertura da terra
Monitoramento ambiental
Mudanças ambientais globais
Políticas ambientais
Poluição do solo
Poluição sonora e meio ambiente
Readaptação do meio ambiente
Redução de emissões de gases
Saneamento ambiental e tratamento de resíduos
Saúde e meio ambiente
Sociedade e meio ambiente
Sustentabilidade ambiental
Transportes e meio ambiente',1467631800,1467669600,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (9,1,'XV Workshop em Desempenho de Sistemas Computacionais e de Comunicação (WPerformance)','WPerformance','Este ano, o WPerformance ocorrerá dias 04 e 05 de julho, em Porto Alegre, em conjunto com o XXXVI Congresso da SBC. O WPerformance’2016 é um fórum para profissionais que atuam na área de avaliação de desempenho de sistemas computacionais e de comunicação, sendo de particular interesse para o evento trabalhos que apresentem novas metodologias ou que aplicam de forma inovadora os métodos existentes para modelar, projetar, avaliar e otimizar o desempenho dos sistemas computacionais e de comunicação.',1467631800,1467756000,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (10,1,'WIT - X Women in Information Technology','WIT','O X Women in Information Technology (WIT) é uma iniciativa da SBC para discutir os assuntos relacionados a questões de gênero e a Tecnologia de Informação (TI) no Brasil – histórias de sucesso, políticas de incentivo e formas de engajamento e atração de jovens, especialmente mulheres, para as carreiras associadas �  TI. Organizado na forma de palestras convidadas e painéis, o workshop estará centrado em debater problemas relacionados �  mulher e ao seu acesso �  TI, tanto do ponto de vista de mercado de trabalho quanto de inclusão e alfabetização digital. Os temas abordados se concentrarão na necessidade de educar, recrutar e treinar mulheres, como uma política estratégica para o desenvolvimento e competitividade nacional e regional.
O objetivo principal do WIT é criar um fórum que promova estratégias para aumentar a participação de mulheres em TI no Brasil. Os temas abordados incluirão:
Aspectos críticos que impactam o acesso pleno das mulheres, treinamento, participação e liderança na área;
Estratégias para aumentar a visibilidade, no Brasil, dos problemas relativos a gênero e TI, com a conscientização de todos os segmentos da nossa sociedade;
Políticas empresariais nacionais e internacionais para fazer face a tais desafios e apresentação de histórias de sucesso.',1467631800,1467756000,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (11,1,'Fórum de Coordenadores de Pós-Graduação',NULL,NULL,1467718200,1467756000,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (12,1,'XIII Simpósio Brasileiro de Sistemas Colaborativos (SBSC 2016)','SBSC','O Simpósio Brasileiro de Sistemas Colaborativos (SBSC) convida a comunidade científica e demais interessados para a submissão de artigos. O SBSC discute o desenvolvimento, a avaliação e o uso de ferramentas para dar suporte �  colaboração entre pessoas. Alguns exemplos atuais de sistemas colaborativos de sucesso incluem redes sociais, ambientes de desenvolvimento distribuído de software, sistemas de compartilhamento de arquivos, mundos virtuais, editores cooperativos, wikis, sistemas de gestão de conhecimento e ferramentas de comunicação, como videoconferência e blogs. As discussões envolvem, sob várias perspectivas, o desenvolvimento e a avaliação de sistemas colaborativos, a investigação de como a colaboração ocorre na prática e a aplicação de sistemas colaborativos em diversos domínios.',1467718200,1467928800,1462902177,1462902177);

INSERT INTO `TB_LOCAL` (ID_LOCAL,PREDIO,TIPO,qntLUGARES,LOCAL,DT_CADASTRO,DT_ALTERACAO) VALUES (1,'40','Teatro',500,'Teatro P40',1462898085,1462898085);
INSERT INTO `TB_LOCAL` (ID_LOCAL,PREDIO,TIPO,qntLUGARES,LOCAL,DT_CADASTRO,DT_ALTERACAO) VALUES (2,'40','Auditorio',97,'Auditório 202',1462898085,1462898085);


INSERT INTO `TB_PALESTRANTE` (ID_PALESTRANTE,NOME,EMAIL,DT_CADASTRO,DT_ALTERACAO) VALUES (1,'Não Informado','Não Informado',1462902265,1462902265);

INSERT INTO `TB_ATIVIDADE` (ID_ATIVIDADE,ID_SUB_EVENTO,SIGLA,TIPO,TITULO,DESCRICAO,ID_LOCAL,DATA,HORA_INICIO,HORA_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (1,1,'n/a','Palestra','n/a','n/a',1,1467621001,1467621001,1467628201,1462903300,1462903300);
INSERT INTO `TB_ATIVIDADE` (ID_ATIVIDADE,ID_SUB_EVENTO,SIGLA,TIPO,TITULO,DESCRICAO,ID_LOCAL,DATA,HORA_INICIO,HORA_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (2,1,'n/a','Palestra','n/a','n/a',1,1467630001,1467630001,1467637201,1462903300,1462903300);
INSERT INTO `TB_ATIVIDADE` (ID_ATIVIDADE,ID_SUB_EVENTO,SIGLA,TIPO,TITULO,DESCRICAO,ID_LOCAL,DATA,HORA_INICIO,HORA_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (3,1,'n/a','Palestra','n/a','n/a',1,1467651601,1467651601,1467658801,1462903300,1462903300);

INSERT INTO `TB_PALESTRANTE_ATIVIDADE` (`ID_PALESTRANTE_ATIVIDADE`,`ID_PALESTRANTE`,`ID_ATIVIDADE`) VALUES (1,1,1);
INSERT INTO `TB_PALESTRANTE_ATIVIDADE` (`ID_PALESTRANTE_ATIVIDADE`,`ID_PALESTRANTE`,`ID_ATIVIDADE`) VALUES (2,1,2);
INSERT INTO `TB_PALESTRANTE_ATIVIDADE` (`ID_PALESTRANTE_ATIVIDADE`,`ID_PALESTRANTE`,`ID_ATIVIDADE`) VALUES (3,1,3);

INSERT INTO `TB_NOTICIAS` (ID_NOTICIA,TITULO,TEXTO,DT_CADASTRO,DT_ALTERACAO,STATUS) VALUES (1,'Inicio do Evento','No dia  03/07 o evento inicia com um curso de Qualidade',1462902977,1462902977,'ATIVO');
INSERT INTO `TB_NOTICIAS` (ID_NOTICIA,TITULO,TEXTO,DT_CADASTRO,DT_ALTERACAO,STATUS) VALUES (2,'Palestra Incicial','No dia 04/07 teremos a palestra de abertura do CSBC no Teatro de preido 40',1462902977,1462902977,'ATIVO');

INSERT INTO `TB_LOGIN` (ID_LOGIN,USUARIO,SENHA) VALUES (1,'admin','admin');


COMMIT;