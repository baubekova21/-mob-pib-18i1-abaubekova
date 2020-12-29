public class Table {

        private final String nameTable;
        private final double price;
        private TableStatus status;

        public Table(String nameTable, double price) {
            this.nameTable = nameTable;
            this.price = price;
            this.status = TableStatus.VACANT;
        }

    public String getNameTable() {
        return nameTable;
    }

    public double getPrice() {
        return price;
    }

    public TableStatus getStatus() {
        return status;
    }

    public void setStatus(TableStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Стол: " + nameTable + " Цена: " + price + " Статус: " + status;
    }
}

