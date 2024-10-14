
    interface Father {
        void showFatherTraits();

    }
    interface Mother {
    void showMotherTraits();
    }
    class Child implements Father, Mother {
        @Override
        public void showFatherTraits() {
            System.out.println("Child has Father's traits: Strong and Protective");
        }
        @Override
        public void showMotherTraits() {
            System.out.println("Child has Mother's traits: Caring and Nurturing");
        }
    }
    public class MultipleInheritance {
        public static void main(String[] args) {
            Child child = new Child();
            child.showFatherTraits();
            child.showMotherTraits();

        }
    }


