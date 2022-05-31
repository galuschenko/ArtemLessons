package com.company.lesson3;

public class Main {

  public static void main(String[] args) {

    DancingRobot robot = new BalletDancingRobot();
    DancingRobot robot1 = new FolkDancingRobot();

    whatBalletDancingRobotDo(robot);
    whatBalletDancingRobotDo(robot1);
  }

  public static void whatBalletDancingRobotDo(DancingRobot robot) {
    System.out.println(robot.getDanceType1());
    System.out.println(robot.getDanceType2());
    System.out.println(robot.getDefaultDanceType());
  }

}
