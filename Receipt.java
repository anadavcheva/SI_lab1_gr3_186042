class Receipt {
    private List<Item> items;

    public Receipt() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    public double sum() {
        return items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }
}

