
package com.senior.g5.doug;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.senior.g5.doug package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _SynccomSeniorG5DougSomaOutErroExecucao_QNAME = new QName("", "erroExecucao");
    private static final QName _SynccomSeniorG5DougSomaOutTotal_QNAME = new QName("", "total");
    private static final QName _SynccomSeniorG5DougSomaInA_QNAME = new QName("", "a");
    private static final QName _SynccomSeniorG5DougSomaInB_QNAME = new QName("", "b");
    private static final QName _SynccomSeniorG5DougSomaInFlowInstanceID_QNAME = new QName("", "flowInstanceID");
    private static final QName _SynccomSeniorG5DougSomaInFlowName_QNAME = new QName("", "flowName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.senior.g5.doug
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SynccomSeniorG5DougSomaIn }
     * 
     * @return
     *     the new instance of {@link SynccomSeniorG5DougSomaIn }
     */
    public SynccomSeniorG5DougSomaIn createSynccomSeniorG5DougSomaIn() {
        return new SynccomSeniorG5DougSomaIn();
    }

    /**
     * Create an instance of {@link SynccomSeniorG5DougSomaOut }
     * 
     * @return
     *     the new instance of {@link SynccomSeniorG5DougSomaOut }
     */
    public SynccomSeniorG5DougSomaOut createSynccomSeniorG5DougSomaOut() {
        return new SynccomSeniorG5DougSomaOut();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "erroExecucao", scope = SynccomSeniorG5DougSomaOut.class)
    public JAXBElement<String> createSynccomSeniorG5DougSomaOutErroExecucao(String value) {
        return new JAXBElement<>(_SynccomSeniorG5DougSomaOutErroExecucao_QNAME, String.class, SynccomSeniorG5DougSomaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "total", scope = SynccomSeniorG5DougSomaOut.class)
    public JAXBElement<Integer> createSynccomSeniorG5DougSomaOutTotal(Integer value) {
        return new JAXBElement<>(_SynccomSeniorG5DougSomaOutTotal_QNAME, Integer.class, SynccomSeniorG5DougSomaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "a", scope = SynccomSeniorG5DougSomaIn.class)
    public JAXBElement<Integer> createSynccomSeniorG5DougSomaInA(Integer value) {
        return new JAXBElement<>(_SynccomSeniorG5DougSomaInA_QNAME, Integer.class, SynccomSeniorG5DougSomaIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "b", scope = SynccomSeniorG5DougSomaIn.class)
    public JAXBElement<Integer> createSynccomSeniorG5DougSomaInB(Integer value) {
        return new JAXBElement<>(_SynccomSeniorG5DougSomaInB_QNAME, Integer.class, SynccomSeniorG5DougSomaIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "flowInstanceID", scope = SynccomSeniorG5DougSomaIn.class)
    public JAXBElement<String> createSynccomSeniorG5DougSomaInFlowInstanceID(String value) {
        return new JAXBElement<>(_SynccomSeniorG5DougSomaInFlowInstanceID_QNAME, String.class, SynccomSeniorG5DougSomaIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "flowName", scope = SynccomSeniorG5DougSomaIn.class)
    public JAXBElement<String> createSynccomSeniorG5DougSomaInFlowName(String value) {
        return new JAXBElement<>(_SynccomSeniorG5DougSomaInFlowName_QNAME, String.class, SynccomSeniorG5DougSomaIn.class, value);
    }

}
