package org.example.models.product;

public enum ProductRating {
    WORST(1),
    WORSE(2),
    NORMAL(3),
    BETTER(4),
    BEST(5);

    private int num;

    ProductRating(int num) {
        this.num = num;
    }

    public int getRate() {
        return num;
    }

    public static ProductRating getVal(Object i) {
        Integer ni = null;
        if (i instanceof String) ni = Integer.parseInt((String) i);
        if (i instanceof Integer) ni = (Integer) i;
        if (ni != null)
            for (ProductRating pr : values())
                if (pr.getRate() == ni)
                    return pr;
                return null;
    }

}
