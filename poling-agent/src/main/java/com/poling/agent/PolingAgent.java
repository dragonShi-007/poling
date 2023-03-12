package com.poling.agent;

import java.lang.instrument.Instrumentation;

public class PolingAgent {

    public static void premain(String agentArgs, Instrumentation inst){
        System.out.println("agent args="+agentArgs);
    }
}
