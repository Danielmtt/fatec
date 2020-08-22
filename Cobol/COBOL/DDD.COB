
       01  TELA1.
           05  BLANK SCREEN.
           05  LINE 02  COLUMN 01 
               VALUE  "                           CADASTRO DE A".
           05  LINE 02  COLUMN 41 
               VALUE  "MIGOS".
           05  LINE 05  COLUMN 01 
               VALUE  "    APELIDO".
           05  LINE 07  COLUMN 01 
               VALUE  "    NOME".
           05  LINE 09  COLUMN 01 
               VALUE  "    EMAIL".
           05  LINE 23  COLUMN 01 
               VALUE  "MENSAGEM".
           05  TAPELICO
               LINE 05  COLUMN 14  PIC X(12)
               USING  APELIDO.
           05  TNOME
               LINE 07  COLUMN 14  PIC X(30)
               USING  TNOME.
           05  TEMAIL
               LINE 09  COLUMN 14  PIC X(30)
               USING  EMAIL.
