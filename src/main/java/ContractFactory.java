package factory;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public class ContractFactory {

    public static @NotNull Contract getContract(String contract) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factory.Contract" + contract);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Contract not found");
        }
        if (!(objeto instanceof Contract)) {
            throw new IllegalArgumentException("Invalid Contract");
        }
        return (Contract) objeto;
    }

}