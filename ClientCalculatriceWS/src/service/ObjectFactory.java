
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SoustractionResponse_QNAME = new QName("http://serviceCalculate/", "SoustractionResponse");
    private final static QName _Addition_QNAME = new QName("http://serviceCalculate/", "Addition");
    private final static QName _Multiplication_QNAME = new QName("http://serviceCalculate/", "Multiplication");
    private final static QName _DivisionResponse_QNAME = new QName("http://serviceCalculate/", "divisionResponse");
    private final static QName _Soustraction_QNAME = new QName("http://serviceCalculate/", "Soustraction");
    private final static QName _Division_QNAME = new QName("http://serviceCalculate/", "division");
    private final static QName _AdditionResponse_QNAME = new QName("http://serviceCalculate/", "AdditionResponse");
    private final static QName _MultiplicationResponse_QNAME = new QName("http://serviceCalculate/", "MultiplicationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Soustraction }
     * 
     */
    public Soustraction createSoustraction() {
        return new Soustraction();
    }

    /**
     * Create an instance of {@link Division }
     * 
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link AdditionResponse }
     * 
     */
    public AdditionResponse createAdditionResponse() {
        return new AdditionResponse();
    }

    /**
     * Create an instance of {@link Addition }
     * 
     */
    public Addition createAddition() {
        return new Addition();
    }

    /**
     * Create an instance of {@link Multiplication }
     * 
     */
    public Multiplication createMultiplication() {
        return new Multiplication();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link MultiplicationResponse }
     * 
     */
    public MultiplicationResponse createMultiplicationResponse() {
        return new MultiplicationResponse();
    }

    /**
     * Create an instance of {@link SoustractionResponse }
     * 
     */
    public SoustractionResponse createSoustractionResponse() {
        return new SoustractionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoustractionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceCalculate/", name = "SoustractionResponse")
    public JAXBElement<SoustractionResponse> createSoustractionResponse(SoustractionResponse value) {
        return new JAXBElement<SoustractionResponse>(_SoustractionResponse_QNAME, SoustractionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceCalculate/", name = "Addition")
    public JAXBElement<Addition> createAddition(Addition value) {
        return new JAXBElement<Addition>(_Addition_QNAME, Addition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceCalculate/", name = "Multiplication")
    public JAXBElement<Multiplication> createMultiplication(Multiplication value) {
        return new JAXBElement<Multiplication>(_Multiplication_QNAME, Multiplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceCalculate/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<DivisionResponse>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soustraction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceCalculate/", name = "Soustraction")
    public JAXBElement<Soustraction> createSoustraction(Soustraction value) {
        return new JAXBElement<Soustraction>(_Soustraction_QNAME, Soustraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceCalculate/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<Division>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceCalculate/", name = "AdditionResponse")
    public JAXBElement<AdditionResponse> createAdditionResponse(AdditionResponse value) {
        return new JAXBElement<AdditionResponse>(_AdditionResponse_QNAME, AdditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceCalculate/", name = "MultiplicationResponse")
    public JAXBElement<MultiplicationResponse> createMultiplicationResponse(MultiplicationResponse value) {
        return new JAXBElement<MultiplicationResponse>(_MultiplicationResponse_QNAME, MultiplicationResponse.class, null, value);
    }

}
