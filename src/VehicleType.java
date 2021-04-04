public class VehicleType {
    protected String attribute;

    public VehicleType(String attribute) {
        this.attribute = attribute;
    }

    public String getAttributeOfType() {
        return attribute;
    }
    public String getTypeName() {
        return "Some vehicle type name";
    }

    @Override
    public int hashCode() {
        return attribute != null ? attribute.hashCode() : 0;
    }
}