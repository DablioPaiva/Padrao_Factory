package factory;

public class ContractFull implements Contract{
    public String hire() { return "Contract effective"; }
    public String print() { return "Contract pleno"; }
    public String dimiss() { return "Contract terminated"; }
}
