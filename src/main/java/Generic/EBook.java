package Generic;

    class EBook extends Book {
        private double fileSizeMb;

        public EBook(String title, String author, double fileSizeMb) {
            super(title, author);
            this.fileSizeMb = fileSizeMb;
        }

        @Override
        public String getDescription() {
            return "E-Book: " + title + " by " + author + " (File size: " + fileSizeMb + " MB)";
        }
    }

