--liquibase formatted sql
--changeset cassio:1
--comment Script para criação das tabelas do projeto.
/***
* Scripts para criacao e insersao de dados
* Base Dados event_e
* Casssio Trindade
* 17/05/2016
***/

USE event_e;

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
INSERT INTO `TB_EVENTO` (ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (1,'XXXVI Congresso da Sociedade Brasileira de ComputaÃ§Ã£o','CSBC 2016','A ComputaÃ§Ã£o Ã© uma Ã¡rea em constante evoluÃ§Ã£o, que se constitui em um elemento estratÃ©gico para o crescimento econÃ´mico e social de todos os paÃ­ses. Por isso, requer planejamento, investimento e intensificaÃ§Ã£o da formaÃ§Ã£o de profissionais qualificados para atender Ã s demandas da sociedade.
Desta forma, o Congresso da Sociedade Brasileira de ComputaÃ§Ã£o 2016 promoverÃ¡ espaÃ§os para trocas, discussÃµes e construÃ§Ãµes na comunidade, de maneira a aumentar a sinergia na busca de soluÃ§Ãµes efetivamente interdisciplinares para os complexos problemas que emergem na sociedade atual. Sociedade esta na qual as portas do conhecimento estÃ£o abertas e interconectadas, demonstrando a necessidade do trabalho conjunto em detrimento da Ãªnfase na hiperespecializaÃ§Ã£o.',1467590401,1467676801,1462898085,1462898085);

INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (1,1,'43 SeminÃ¡rio Integrado de Software e Hardware','SEMISH','O SEMISH, principal fÃ³rum cientÃ­fico do Congresso da Sociedade Brasileira de ComputaÃ§Ã£o (CSBC), estÃ¡ em sua quadragÃ©sima terceira ediÃ§Ã£o e ocorrerÃ¡ em Porto Alegre, nos dias 4 e 5 de julho, juntamente com o XXXVI CSBC. Este ano o Congresso da SBC discutirÃ¡ "ComputaÃ§Ã£o e Interdisciplinaridade". O SEMISH 2016 acompanharÃ¡ essa temÃ¡tica, tendo como base os documentos norteadores oriundos das discussÃµes, na SBC, sobre os Grandes Desafios da ComputaÃ§Ã£o no Brasil [1, 2, 3]. Nesse sentido, convidamos a comunidade a compartilhar experiÃªncias por meio da submissÃ£o de artigos completos, em portuguÃªs ou inglÃªs, que descrevam soluÃ§Ãµes que avancem o estado-da-arte ou apresentem direÃ§Ãµes de pesquisa efetivamente interdisciplinares para os problemas complexos que emergem na sociedade atual. DomÃ­nios de interesse incluem, por exemplo, SaÃºde, EducaÃ§Ã£o, SeguranÃ§a, Energia, RecuperaÃ§Ã£o de CatÃ¡strofes e Mobilidade Urbana. Reiteramos que essa lista Ã© apenas ilustrativa, e que o SEMISH estÃ¡ aberto para receber artigos que enfatizem outros tÃ³picos que, de alguma forma, se enquadrem no Ã¢mbito ComputaÃ§Ã£o e Interdisciplinaridade.',1467631800,1467756000,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (2,1,'I ETC - ENCONTRO DE TEORIA DA COMPUTAÃÃO','ETC','O I Encontro de Teoria da ComputaÃ§Ã£o (ETC 2016) Ã© um fÃ³rum voltado para a grande Ã¡rea de Teoria da ComputaÃ§Ã£o, sendo proposto por membros da ComissÃ£o Especial em Algoritmos, CombinatÃ³ria e OtimizaÃ§Ã£o (CE-ACO), com objetivo de promover uma maior divulgaÃ§Ã£o da Ã¡rea para a comunidade brasileira de computaÃ§Ã£o e afins, atravÃ©s do principal evento da SBC, o XXXVI CSBC (Congresso da Sociedade Brasileira de ComputaÃ§Ã£o).
Este evento Ã©  voltado para os alunos em formaÃ§Ã£o, mas tambÃ©m visando proporcionar uma maior integraÃ§Ã£o entre os pesquisadores e profissionais que atuam na mesma, seja com enfoque em teoria pura ou em aplicaÃ§Ãµes, estimulando a discussÃ£o da importÃ¢ncia dos fundamentos da computaÃ§Ã£o e sua aplicaÃ§Ã£o direta no entendimento e resoluÃ§Ã£o de problemas das mais diversas Ã¡reas e segmentos de mercado.',1467631800,1467669600,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (3,1,'29Âº CTD - Concurso de Teses e DissertaÃ§Ãµes','CTD','O XXIX Concurso de Teses e DissertaÃ§Ãµes (CTD) do CSBC selecionarÃ¡ e premiarÃ¡ as melhores teses de doutorado e dissertaÃ§Ãµes de mestrado da Ã¡rea de ComputaÃ§Ã£o do paÃ­s concluÃ­das, defendidas e aprovadas, no perÃ­odo de 1Âº de janeiro a 31 de dezembro de 2015. As teses e dissertaÃ§Ãµes que concorrerem nesta ediÃ§Ã£o serÃ£o avaliadas de acordo com os resultados cientÃ­ficos e tecnolÃ³gicos jÃ¡ gerados pelo trabalho, assim como pelo seu potencial de impacto na sociedade e no estado da arte na Ã¡rea de ComputaÃ§Ã£o.',1467631800,1467734400,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (4,1,'35a JAI 2016 - Jornada de AtualizaÃ§Ã£o em InformÃ¡tica','JAI','A Jornada de AtualizaÃ§Ã£o em InformÃ¡tica (JAI) Ã© um dos mais importantes eventos acadÃªmicos de atualizaÃ§Ã£o cientÃ­fica e tecnolÃ³gica da comunidade de ComputaÃ§Ã£o do Brasil. Tradicionalmente realizada em conjunto com o Congresso da SBC â que em 2016 acontecerÃ¡ em Porto Alegre de 4 a 7 de julho â, a JAI compreende trabalhos de pesquisadores sÃªniores da nossa comunidade, oferecendo uma oportunidade Ãºnica para acadÃªmicos e profissionais de informÃ¡tica atualizarem-se em temas diversos, interagindo com lÃ­deres das mais diversas Ã¡reas de pesquisa no Brasi',1467631800,1467928800,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (5,1,'WEI''2016 - XXIV Workshop sobre EducaÃ§Ã£o em ComputaÃ§Ã£o','WEI','O WEI Ã© um evento anual promovido pela Sociedade Brasileira de ComputaÃ§Ã£o (SBC) com o objetivo de ser um fÃ³rum de debates sobre diferentes temas relacionados ao ensino e Ã  aprendizagem de ComputaÃ§Ã£o. O WEI constitui-se em um importante fÃ³rum brasileiro para apresentaÃ§Ãµes de trabalhos cientÃ­ficos, reuniÃµes e debates entre professores, estudantes, coordenadores de cursos e demais interessados na melhoria da educaÃ§Ã£o em ComputaÃ§Ã£o. No contexto da EducaÃ§Ã£o em ComputaÃ§Ã£o, precisamos repensar nossos modos de ensinar e de aprender utilizando mÃ©todos, tÃ©cnicas e ferramentas capazes de favorecer a construÃ§Ã£o de conhecimento no Ã¢mbito da ComputaÃ§Ã£o.',1467631800,1467756000,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (6,1,'XVI Workshop de InformÃ¡tica MÃ©dica (WIM 2016)','WIM','O XVI Workshop de InformÃ¡tica MÃ©dica (WIM 2016) tem como objetivo reunir, no Ã¢mbito da Sociedade Brasileira de ComputaÃ§Ã£o (SBC), pesquisadores, estudantes, professores, empresÃ¡rios e profissionais interessados em ComputaÃ§Ã£o aplicada Ã  SaÃºde. O WIM 2016 serÃ¡ realizado nos dias 04 e 06 de julho de 2016 como parte dos eventos do XXXVI Congresso da Sociedade Brasileira de ComputaÃ§Ã£o (CSBC), em Porto Alegre, RS. O WIM Ã© o evento anual da ComissÃ£o Especial de ComputaÃ§Ã£o Aplicada Ã  SaÃºde (CE-CAS) da SBC.
As atividades no WIM compreendem apresentaÃ§Ã£o de artigos completos e artigos resumidos relatando trabalhos em andamento, alÃ©m de palestras convidadas e mesas-redondas, distribuÃ­das ao longo de trÃªs dias do CSBC.',1467631800,1467820800,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (8,1,'WCAMA 2016 â VII Workshop de ComputaÃ§Ã£o Aplicada Ã  GestÃ£o do Meio Ambiente e Recursos Naturais','WCAMA','O workshop abrange toda as Ã¡reas de pesquisas e aplicaÃ§Ãµes em metodologias, tÃ©cnicas e ferramentas computacionais aplicadas Ã  gestÃ£o do meio ambiente e dos recursos naturais, incluindo (mas nÃ£o limitado a):
Ãreas alagadas e vÃ¡rzeas
Ãreas prioritÃ¡rias Ã  conservaÃ§Ã£o
Controle da poluiÃ§Ã£o do ar
Ecologia de paisagem
Ecologia urbana
Fragilidade ambiental
Gerenciamento de lixo sÃ³lido
Gerenciamento de recursos naturais e renovÃ¡veis
Modelagem de distribuiÃ§Ã£o de espÃ©cies
Modelagem de mudanÃ§a de uso e cobertura da terra
Monitoramento ambiental
MudanÃ§as ambientais globais
PolÃ­ticas ambientais
PoluiÃ§Ã£o do solo
PoluiÃ§Ã£o sonora e meio ambiente
ReadaptaÃ§Ã£o do meio ambiente
ReduÃ§Ã£o de emissÃµes de gases
Saneamento ambiental e tratamento de resÃ­duos
SaÃºde e meio ambiente
Sociedade e meio ambiente
Sustentabilidade ambiental
Transportes e meio ambiente',1467631800,1467669600,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (9,1,'XV Workshop em Desempenho de Sistemas Computacionais e de ComunicaÃ§Ã£o (WPerformance)','WPerformance','Este ano, o WPerformance ocorrerÃ¡ dias 04 e 05 de julho, em Porto Alegre, em conjunto com o XXXVI Congresso da SBC. O WPerformanceâ2016 Ã© um fÃ³rum para profissionais que atuam na Ã¡rea de avaliaÃ§Ã£o de desempenho de sistemas computacionais e de comunicaÃ§Ã£o, sendo de particular interesse para o evento trabalhos que apresentem novas metodologias ou que aplicam de forma inovadora os mÃ©todos existentes para modelar, projetar, avaliar e otimizar o desempenho dos sistemas computacionais e de comunicaÃ§Ã£o.',1467631800,1467756000,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (10,1,'WIT - X Women in Information Technology','WIT','O X Women in Information Technology (WIT) é uma iniciativa da SBC para discutir os assuntos relacionados a questões de gênero e a Tecnologia de Informação (TI) no Brasil à histórias de sucesso, políticas de incentivo e formas de engajamento e atração de jovens, especialmente mulheres, para as carreiras associadas a TI. Organizado na forma de palestras convidadas e painéis, o workshop estará centrado em debater problemas relacionados à mulher e ao seu acesso à  TI, tanto do ponto de vista de mercado de trabalho quanto de inclusão e alfabetização digital. Os temas abordados se concentrarão na necessidade de educar, recrutar e treinar mulheres, como uma política estratégica para o desenvolvimento e competitividade nacional e regional.
O objetivo principal do WIT é criar um fórum que promova estratégias para aumentar a participação de mulheres em TI no Brasil. Os temas abordados incluirão:
Aspectos críticos que impactam o acesso pleno das mulheres, treinamento, participação e liderança na área;
Estratégias para aumentar a visibilidade, no Brasil, dos problemas relativos a gênero e TI, com a conscientização de todos os segmentos da nossa sociedade;
Políticas empresariais nacionais e internacionais para fazer face a tais desafios e apresentação de histórias de sucesso.',1467631800,1467756000,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (11,1,'FÃ³rum de Coordenadores de PÃ³s-GraduaÃ§Ã£o',NULL,NULL,1467718200,1467756000,1462902177,1462902177);
INSERT INTO `TB_SUB_EVENTO` (ID_SUB_EVENTO,ID_EVENTO,NOME,SIGLA,DESCRICAO,DT_INICIO,DT_FIM,DT_CADASTRO,DT_ALTERACAO) VALUES (12,1,'XIII SimpÃ³sio Brasileiro de Sistemas Colaborativos (SBSC 2016)','SBSC','O SimpÃ³sio Brasileiro de Sistemas Colaborativos (SBSC) convida a comunidade cientÃ­fica e demais interessados para a submissÃ£o de artigos. O SBSC discute o desenvolvimento, a avaliaÃ§Ã£o e o uso de ferramentas para dar suporte Ã  colaboraÃ§Ã£o entre pessoas. Alguns exemplos atuais de sistemas colaborativos de sucesso incluem redes sociais, ambientes de desenvolvimento distribuÃ­do de software, sistemas de compartilhamento de arquivos, mundos virtuais, editores cooperativos, wikis, sistemas de gestÃ£o de conhecimento e ferramentas de comunicaÃ§Ã£o, como videoconferÃªncia e blogs. As discussÃµes envolvem, sob vÃ¡rias perspectivas, o desenvolvimento e a avaliaÃ§Ã£o de sistemas colaborativos, a investigaÃ§Ã£o de como a colaboraÃ§Ã£o ocorre na prÃ¡tica e a aplicaÃ§Ã£o de sistemas colaborativos em diversos domÃ­nios.',1467718200,1467928800,1462902177,1462902177);

INSERT INTO `TB_LOCAL` (ID_LOCAL,PREDIO,TIPO,qntLUGARES,LOCAL,DT_CADASTRO,DT_ALTERACAO) VALUES (1,'40','Teatro',500,'Teatro P40',1462898085,1462898085);
INSERT INTO `TB_LOCAL` (ID_LOCAL,PREDIO,TIPO,qntLUGARES,LOCAL,DT_CADASTRO,DT_ALTERACAO) VALUES (2,'40','Auditorio',97,'AuditÃ³rio 202',1462898085,1462898085);


INSERT INTO `TB_PALESTRANTE` (ID_PALESTRANTE,NOME,EMAIL,DT_CADASTRO,DT_ALTERACAO) VALUES (1,'NÃ£o Informado','NÃ£o Informado',1462902265,1462902265);

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
