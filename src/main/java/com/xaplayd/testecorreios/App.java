package com.xaplayd.testecorreios;

import com.senior.g5.doug.*;

public class App {

    public static void main(String[] args) {
        try {
            // Habilita o dump de mensagens SOAP
            System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
            System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
            System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
            System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");

            // Criando o serviço
            G5SeniorServices service = new G5SeniorServices();
            SapiensSynccomSeniorG5Doug port = service.getSapiensSynccomSeniorG5DougPort();

            // Criando objeto de entrada
            SynccomSeniorG5DougSomaIn input = new SynccomSeniorG5DougSomaIn();
            ObjectFactory factory = new ObjectFactory();

            Integer a = 7;
            Integer b = 3;

            input.setA(factory.createSynccomSeniorG5DougSomaInA(a));
            input.setB(factory.createSynccomSeniorG5DougSomaInB(b));
            //input.setFlowInstanceID(factory.createSynccomSeniorG5DougOcorrenciastesteInFlowInstanceID("12345"));
            //input.setFlowName(factory.createSynccomSeniorG5DougOcorrenciastesteInFlowName("TesteFluxo"));

            // Chamando o serviço
            SynccomSeniorG5DougSomaOut result = port.soma(
                    "user here",
                    "pass here",
                    0,
                    input
            );

            // Exibindo resultado
            if (result.getErroExecucao() != null && result.getErroExecucao().getValue() != null) {
                System.out.println("Erro: " + result.getErroExecucao().getValue());
            } else {
                System.out.println("Total: " + (result.getTotal() != null ? result.getTotal().getValue() : "null"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}