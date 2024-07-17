class Textiles {
    private static String[] materials = new String[15];
    private static int materialCount;

    public static boolean addMaterial(String material) {
        if (material == null) {
            System.out.println("Material name cannot be null.");
            return false;
        }

        if (materialCount >= materials.length) {
            System.out.println("Cannot add more materials. Limit reached.");
            return false;
        }

        for (int i = 0; i < materialCount; i++) {
            if (materials[i].equalsIgnoreCase(material)) {
                System.out.println("Material '" + material + "' already exists.");
                return false;
            }
        }

        materials[materialCount++] = material;
        //System.out.println("Material '" + material + "' added successfully.");
        return true;
    }

    public static void updateMaterial(String oldMaterial, String newMaterial) {
        boolean isfound = false;
        for (int i = 0; i < materialCount; i++) {
            if (materials[i].equalsIgnoreCase(oldMaterial)) {
                materials[i] = newMaterial;
                isfound = true;
                System.out.println("Material '" + oldMaterial + "' updated to '" + newMaterial + "'.");
                break;
            }
        }
        if (!isfound) {
            System.out.println("Material '" + oldMaterial + "' not isfound.");
        }
    }

    public static void listMaterials() {
        System.out.println("List of Textile Materials:");
        for (int i = 0; i < materialCount; i++) {
            System.out.println((i + 1) + ". " + materials[i]);
        }
    }

    public static void main(String[] args) {
        // Adding 15 different materials
        addMaterial("Cotton");
        addMaterial("Silk");
        addMaterial("Wool");
        addMaterial("Polyester");
        addMaterial("Linen");
        addMaterial("Rayon");
        addMaterial("Nylon");
        addMaterial("Acrylic");
        addMaterial("Spandex");
        addMaterial("Velvet");
        addMaterial("Cashmere");
        addMaterial("Denim");
        addMaterial("Chiffon");
        addMaterial("Satin");
        addMaterial("Tweed");
		
		        addMaterial("Satin");

		
		listMaterials();

        // Trying to add a duplicate material
        addMaterial("Silk");

        // Updating a material
        updateMaterial("Silk", "Satin Silk");

        // Listing all materials
        listMaterials();
    }
}
