package kr.hk.lv1;

public class PressingKeypad {
    private Hand leftHand = new Hand(10, "left");
    private Hand rightHand = new Hand(12, "right");

    public String solution(int[] numbers, String hand) {
        StringBuilder stb = new StringBuilder();

        for(int number : numbers) {
            if(number == 1 || number == 4 || number == 7) {
                stb.append("L");
                leftHand.setPosition(number);
            }
            else if(number == 3 || number == 6 || number == 9) {
                stb.append("R");
                rightHand.setPosition(number);
            }
            else {
                String properHand = findProperHand(number, hand);
                stb.append(properHand);
            }
        }

        return stb.toString();
    }

    String findProperHand(int number, String hand) {
        int distanceFromLeft = calculateDistance(leftHand, number);
        int distanceFromRight = calculateDistance(rightHand, number);

        if(distanceFromLeft == distanceFromRight) {
            if(hand.equals(rightHand.getRightOrLeftStr())) {
                rightHand.setPosition(number);
                return "R";
            }
            else {
                leftHand.setPosition(number);
                return "L";
            }
        } else if (distanceFromLeft < distanceFromRight) {
            leftHand.setPosition(number);
            return "L";
        }
        else {
            rightHand.setPosition(number);
            return "R";
        }
    }

    int calculateDistance(Hand hand, int number) {
        int position = hand.getPosition();

        if (position  == 0) position = 11;
        if (number == 0 ) number = 11;

        int positionX = (position - 1) / 3;
        int positionY = (position - 1) % 3;

        int numX = (number - 1) / 3;
        int numY = (number - 1) % 3;

        int distance = Math.abs(positionX - numX) + Math.abs(positionY - numY);

        return distance;
    }

}
class Hand {
    private int position;
    private String rightOrLeftStr;

    Hand(int position, String rightOrLeftStr) {
        this.position = position;
        this.rightOrLeftStr = rightOrLeftStr;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public String getRightOrLeftStr() {
        return rightOrLeftStr;
    }
}

