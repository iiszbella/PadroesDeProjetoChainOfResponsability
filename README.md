Atividade da disciplina de Padrões de Projeto – Chain of Responsibility
O projeto desenvolvido aplica o padrão Chain of Responsibility em um cenário de suporte técnico. 
A ideia central é demonstrar como diferentes níveis de atendimento podem tratar requisições de forma organizada e escalonada, sem que o cliente precise conhecer diretamente qual funcionário resolverá o chamado.

No modelo proposto, cada nível de suporte (Atendente, Analista I, Analista II, Analista III e Especialista) é representado por uma classe que herda de uma abstração comum (Funcionario). Cada cargo possui a responsabilidade de atender apenas determinados tipos de chamados (instalação de aplicativos, certificados, firewall, projetos e arquitetura). 
Caso o chamado não seja de sua competência, ele é repassado automaticamente ao próximo nível da cadeia.

Escolhi o suporte técnico como cenário para essa atividade porque ele reflete bem a lógica de escalonamento de problemas: chamados simples são resolvidos rapidamente nos níveis básicos, enquanto os mais complexos são encaminhados para especialistas.
Isso torna o uso do Chain of Responsibility ideal para organizar o fluxo de atendimento, reduzir acoplamento e facilitar a expansão do sistema.

Diagrama UML - https://drive.google.com/file/d/1bwbggxaBeO81z-kYFQlYNGi2pasj1wFg/view?usp=sharing
