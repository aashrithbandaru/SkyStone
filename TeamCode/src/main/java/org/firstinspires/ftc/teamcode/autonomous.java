package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;
@Autonomous(name="FoundationBlue", group="Linear Opmode")
//Disabled

public class autonomous extends Movement {
    private ElapsedTime runtime = new ElapsedTime();


    @Override public void runOpModeImpl() {

        waitForStart();
        runtime.reset();


        //drive forward
        goForward(0.5,2250);


        telemetry.addData("Status", "Stop Program");
        telemetry.update();

    }
}

