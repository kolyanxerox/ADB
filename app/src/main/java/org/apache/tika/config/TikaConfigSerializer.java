package org.apache.tika.config;

import OooO0oO.OooOo;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import o0oOO.OooO0O0;
import o0oOO.OooO0o;
import org.apache.tika.detect.CompositeDetector;
import org.apache.tika.detect.CompositeEncodingDetector;
import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.DefaultEncodingDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.detect.EncodingDetector;
import org.apache.tika.language.translate.DefaultTranslator;
import org.apache.tika.language.translate.Translator;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.CompositeParser;
import org.apache.tika.parser.DefaultParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.ParserDecorator;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.parser.multiple.AbstractMultipleParser;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* loaded from: classes3.dex */
public class TikaConfigSerializer {
    private static final OooO0O0 LOG = OooO0o.OooO0O0(TikaConfigSerializer.class);
    private static Map<Class, String> PRIMITIVES;

    public static class MethodTuple {
        Method method;
        String name;
        Class singleParam;

        public MethodTuple(String str, Method method, Class cls) {
            this.name = str;
            this.method = method;
            this.singleParam = cls;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                MethodTuple methodTuple = (MethodTuple) obj;
                if (this.name.equals(methodTuple.name) && this.method.equals(methodTuple.method) && this.singleParam.equals(methodTuple.singleParam)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.name, this.method, this.singleParam);
        }
    }

    public static class MethodTuples {
        Map<String, Set<MethodTuple>> tuples;

        public /* synthetic */ MethodTuples(int i) {
            this();
        }

        public void add(MethodTuple methodTuple) {
            Set<MethodTuple> hashSet = this.tuples.get(methodTuple.name);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                this.tuples.put(methodTuple.name, hashSet);
            }
            hashSet.add(methodTuple);
        }

        public int getSize() {
            return this.tuples.size();
        }

        private MethodTuples() {
            this.tuples = new TreeMap();
        }
    }

    public enum Mode {
        MINIMAL,
        CURRENT,
        STATIC,
        STATIC_FULL
    }

    static {
        HashMap map = new HashMap();
        PRIMITIVES = map;
        map.put(Integer.class, "int");
        PRIMITIVES.put(Integer.TYPE, "int");
        PRIMITIVES.put(String.class, "string");
        PRIMITIVES.put(Boolean.class, "bool");
        PRIMITIVES.put(Boolean.TYPE, "bool");
        PRIMITIVES.put(Float.class, "float");
        PRIMITIVES.put(Float.TYPE, "float");
        PRIMITIVES.put(Double.class, "double");
        PRIMITIVES.put(Double.TYPE, "double");
        PRIMITIVES.put(Long.class, "long");
        PRIMITIVES.put(Long.TYPE, "long");
        PRIMITIVES.put(Map.class, "map");
        PRIMITIVES.put(List.class, "list");
    }

    private static void addDetectors(Mode mode, Element element, Document document, TikaConfig tikaConfig) throws Exception {
        Detector detector = tikaConfig.getDetector();
        if (mode == Mode.MINIMAL && (detector instanceof DefaultDetector)) {
            element.appendChild(document.createComment("for example: <detectors><detector class=\"org.apache.tika.detector.MimeTypes\"></detectors>"));
            return;
        }
        Element elementCreateElement = document.createElement("detectors");
        if (!(mode == Mode.CURRENT && (detector instanceof DefaultDetector)) && (detector instanceof CompositeDetector)) {
            for (Detector detector2 : ((CompositeDetector) detector).getDetectors()) {
                Element elementCreateElement2 = document.createElement("detector");
                elementCreateElement2.setAttribute(Constants.CLASS, detector2.getClass().getCanonicalName());
                serializeParams(document, elementCreateElement2, detector2);
                elementCreateElement.appendChild(elementCreateElement2);
            }
        } else {
            Element elementCreateElement3 = document.createElement("detector");
            elementCreateElement3.setAttribute(Constants.CLASS, detector.getClass().getCanonicalName());
            elementCreateElement.appendChild(elementCreateElement3);
        }
        element.appendChild(elementCreateElement);
    }

    private static void addEncodingDetectors(Mode mode, Element element, Document document, TikaConfig tikaConfig) throws Exception {
        EncodingDetector encodingDetector = tikaConfig.getEncodingDetector();
        if (mode == Mode.MINIMAL && (encodingDetector instanceof DefaultEncodingDetector)) {
            element.appendChild(document.createComment("for example: <encodingDetectors><encodingDetector class=\"org.apache.tika.detect.DefaultEncodingDetector\"></encodingDetectors>"));
            return;
        }
        Element elementCreateElement = document.createElement("encodingDetectors");
        if (!(mode == Mode.CURRENT && (encodingDetector instanceof DefaultEncodingDetector)) && (encodingDetector instanceof CompositeEncodingDetector)) {
            for (EncodingDetector encodingDetector2 : ((CompositeEncodingDetector) encodingDetector).getDetectors()) {
                Element elementCreateElement2 = document.createElement("encodingDetector");
                elementCreateElement2.setAttribute(Constants.CLASS, encodingDetector2.getClass().getCanonicalName());
                serializeParams(document, elementCreateElement2, encodingDetector2);
                elementCreateElement.appendChild(elementCreateElement2);
            }
        } else {
            Element elementCreateElement3 = document.createElement("encodingDetector");
            elementCreateElement3.setAttribute(Constants.CLASS, encodingDetector.getClass().getCanonicalName());
            elementCreateElement.appendChild(elementCreateElement3);
        }
        element.appendChild(elementCreateElement);
    }

    private static void addExecutorService(Mode mode, Element element, Document document, TikaConfig tikaConfig) {
        tikaConfig.getExecutorService();
    }

    private static void addList(Element element, Document document, MethodTuple methodTuple, List<String> list) throws DOMException {
        for (String str : list) {
            Element elementCreateElement = document.createElement("string");
            elementCreateElement.setTextContent(str);
            element.appendChild(elementCreateElement);
        }
    }

    private static void addMap(Element element, Document document, MethodTuple methodTuple, Map<String, String> map) throws DOMException {
        for (Map.Entry entry : new TreeMap(map).entrySet()) {
            Element elementCreateElement = document.createElement("string");
            elementCreateElement.setAttribute("key", (String) entry.getKey());
            elementCreateElement.setAttribute("value", (String) entry.getValue());
            element.appendChild(elementCreateElement);
        }
    }

    private static void addMimeComment(Mode mode, Element element, Document document) throws DOMException {
        element.appendChild(document.createComment("for example: <mimeTypeRepository resource=\"/org/apache/tika/mime/tika-mimetypes.xml\"/>"));
    }

    private static void addParser(Mode mode, Element element, Document document, Parser parser) throws Exception {
        ParserDecorator parserDecorator;
        if ((parser instanceof ParserDecorator) && parser.getClass().getName().startsWith(ParserDecorator.class.getName().concat("$"))) {
            ParserDecorator parserDecorator2 = (ParserDecorator) parser;
            parserDecorator = parserDecorator2;
            parser = parserDecorator2.getWrappedParser();
        } else {
            parserDecorator = null;
        }
        List<Parser> allParsers = Collections.EMPTY_LIST;
        boolean zEquals = true;
        if (mode != Mode.CURRENT || !(parser instanceof DefaultParser)) {
            if (parser instanceof CompositeParser) {
                allParsers = ((CompositeParser) parser).getAllComponentParsers();
                zEquals = true ^ parser.getClass().equals(CompositeParser.class);
                if ((parser instanceof DefaultParser) && (mode == Mode.STATIC || mode == Mode.STATIC_FULL)) {
                    zEquals = false;
                }
            } else if (parser instanceof AbstractMultipleParser) {
                allParsers = ((AbstractMultipleParser) parser).getAllParsers();
            }
        }
        if (zEquals) {
            element = addParser(mode, element, document, parser, parserDecorator);
        }
        Iterator<Parser> it = allParsers.iterator();
        while (it.hasNext()) {
            addParser(mode, element, document, it.next());
        }
    }

    private static void addParsers(Mode mode, Element element, Document document, TikaConfig tikaConfig) throws Exception {
        Parser parser = tikaConfig.getParser();
        Mode mode2 = Mode.MINIMAL;
        if (mode == mode2 && (parser instanceof DefaultParser)) {
            return;
        }
        if (mode == mode2) {
            mode = Mode.CURRENT;
        }
        Element elementCreateElement = document.createElement("parsers");
        element.appendChild(elementCreateElement);
        addParser(mode, elementCreateElement, document, parser);
    }

    private static void addServiceLoader(Mode mode, Element element, Document document, TikaConfig tikaConfig) throws DOMException {
        ServiceLoader serviceLoader = tikaConfig.getServiceLoader();
        if (mode == Mode.MINIMAL && serviceLoader.isDynamic() && serviceLoader.getLoadErrorHandler() == LoadErrorHandler.IGNORE) {
            return;
        }
        Element elementCreateElement = document.createElement("service-loader");
        elementCreateElement.setAttribute("dynamic", Boolean.toString(serviceLoader.isDynamic()));
        elementCreateElement.setAttribute("loadErrorHandler", serviceLoader.getLoadErrorHandler().toString());
        element.appendChild(elementCreateElement);
    }

    private static void addTranslator(Mode mode, Element element, Document document, TikaConfig tikaConfig) throws DOMException {
        Translator translator = tikaConfig.getTranslator();
        if (mode == Mode.MINIMAL && (translator instanceof DefaultTranslator)) {
            element.appendChild(document.createComment("for example: <translator class=\"org.apache.tika.language.translate.GoogleTranslator\"/>"));
            return;
        }
        if ((translator instanceof DefaultTranslator) && (mode == Mode.STATIC || mode == Mode.STATIC_FULL)) {
            translator = ((DefaultTranslator) translator).getTranslator();
        }
        if (translator == null) {
            element.appendChild(document.createComment("No translators available"));
            return;
        }
        Element elementCreateElement = document.createElement("translator");
        elementCreateElement.setAttribute(Constants.CLASS, translator.getClass().getCanonicalName());
        element.appendChild(elementCreateElement);
    }

    private static Method findGetter(MethodTuple methodTuple, Object obj) throws SecurityException {
        Matcher matcher = Pattern.compile("\\A(?:get|is)([A-Z].+)\\Z").matcher("");
        for (Method method : obj.getClass().getMethods()) {
            if (obj.getClass().getName().contains("PDF")) {
                System.out.println(method.getName());
            }
            if (matcher.reset(method.getName()).find()) {
                if (obj.getClass().getName().contains("PDF")) {
                    System.out.println("2: " + method.getName());
                }
                if (methodTuple.name.equals(matcher.group(1))) {
                    if (methodTuple.singleParam.equals(method.getReturnType())) {
                        return method;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private static String methodToParamName(String str) {
        return StringUtils.isBlank(str) ? str : OooOo.OooOoo0(str.substring(0, 1).toLowerCase(Locale.US), str.substring(1));
    }

    private static MethodTuple pickBestSetter(Set<MethodTuple> set) {
        Iterator<MethodTuple> it = set.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    private static void processNonPrimitive(String str, Set<MethodTuple> set, Set<MethodTuple> set2, Document document, Element element, Object obj) throws IllegalAccessException, DOMException, SecurityException, IllegalArgumentException, InvocationTargetException {
        for (MethodTuple methodTuple : set) {
            for (MethodTuple methodTuple2 : set2) {
                if (methodTuple.singleParam.equals(methodTuple2.singleParam)) {
                    serializeObject(str, document, element, methodTuple, methodTuple2, obj);
                    return;
                }
            }
        }
    }

    public static void serialize(TikaConfig tikaConfig, Mode mode, Writer writer, Charset charset) throws Exception {
        Document documentNewDocument = XMLReaderUtils.getDocumentBuilder().newDocument();
        Element elementCreateElement = documentNewDocument.createElement("properties");
        documentNewDocument.appendChild(elementCreateElement);
        addMimeComment(mode, elementCreateElement, documentNewDocument);
        addServiceLoader(mode, elementCreateElement, documentNewDocument, tikaConfig);
        addExecutorService(mode, elementCreateElement, documentNewDocument, tikaConfig);
        addEncodingDetectors(mode, elementCreateElement, documentNewDocument, tikaConfig);
        addTranslator(mode, elementCreateElement, documentNewDocument, tikaConfig);
        addDetectors(mode, elementCreateElement, documentNewDocument, tikaConfig);
        addParsers(mode, elementCreateElement, documentNewDocument, tikaConfig);
        Transformer transformer = XMLReaderUtils.getTransformer();
        transformer.setOutputProperty("indent", "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
        transformer.setOutputProperty("encoding", charset.name());
        transformer.transform(new DOMSource(documentNewDocument), new StreamResult(writer));
    }

    private static void serializeNonPrimitives(Document document, Element element, Object obj, MethodTuples methodTuples, MethodTuples methodTuples2) throws IllegalAccessException, DOMException, SecurityException, IllegalArgumentException, InvocationTargetException {
        for (Map.Entry<String, Set<MethodTuple>> entry : methodTuples.tuples.entrySet()) {
            Document document2 = document;
            Element element2 = element;
            Object obj2 = obj;
            processNonPrimitive(entry.getKey(), entry.getValue(), methodTuples2.tuples.get(entry.getKey()), document2, element2, obj2);
            if (!methodTuples2.tuples.containsKey(entry.getKey())) {
                LOG.OooOO0O(entry.getKey(), "no getter for setter non-primitive: {} in {}", obj2.getClass());
            }
            document = document2;
            element = element2;
            obj = obj2;
        }
    }

    private static void serializeObject(String str, Document document, Element element, MethodTuple methodTuple, MethodTuple methodTuple2, Object obj) throws IllegalAccessException, DOMException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = methodTuple2.method.invoke(obj, null);
            if (objInvoke == null) {
                LOG.OooOO0O(methodTuple2.name, "Getter {} on {} returned null", obj.getClass());
            }
            Element elementCreateElement = document.createElement(str);
            elementCreateElement.setAttribute(Constants.CLASS, objInvoke.getClass().getCanonicalName());
            element.appendChild(elementCreateElement);
            serializeParams(document, element, objInvoke);
        } catch (IllegalAccessException | InvocationTargetException e) {
            LOG.OooO("couldn't get " + str + " on " + obj.getClass(), e);
        }
    }

    public static void serializeParams(Document document, Element element, Object obj) throws IllegalAccessException, DOMException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method[] methodArr;
        Matcher matcher = Pattern.compile("\\Aset([A-Z].*)").matcher("");
        Matcher matcher2 = Pattern.compile("\\A(?:get|is)([A-Z].+)\\Z").matcher("");
        int i = 0;
        MethodTuples methodTuples = new MethodTuples(i);
        MethodTuples methodTuples2 = new MethodTuples(i);
        MethodTuples methodTuples3 = new MethodTuples(i);
        MethodTuples methodTuples4 = new MethodTuples(i);
        Method[] methods = obj.getClass().getMethods();
        int length = methods.length;
        int i2 = 0;
        while (i2 < length) {
            Method method = methods[i2];
            Class<?>[] parameterTypes = method.getParameterTypes();
            int i3 = i;
            if (matcher.reset(method.getName()).find()) {
                if (!Modifier.isPublic(method.getModifiers())) {
                    LOG.OooO0oO("inaccessible setter: {} in {}", method.getName(), obj.getClass());
                } else if (method.getAnnotation(Field.class) != null) {
                    if (parameterTypes.length != 1) {
                        methodArr = methods;
                        LOG.OooOo0o("setter with wrong number of params " + method.getName() + StringUtils.SPACE + parameterTypes.length);
                    } else {
                        methodArr = methods;
                        String strMethodToParamName = methodToParamName(matcher.group(1));
                        if (PRIMITIVES.containsKey(parameterTypes[i3])) {
                            methodTuples2.add(new MethodTuple(strMethodToParamName, method, parameterTypes[i3]));
                        } else {
                            methodTuples.add(new MethodTuple(strMethodToParamName, method, parameterTypes[i3]));
                        }
                    }
                }
                methodArr = methods;
            } else {
                methodArr = methods;
                if (matcher2.reset(method.getName()).find() && parameterTypes.length == 0) {
                    String strMethodToParamName2 = methodToParamName(matcher2.group(1));
                    if (PRIMITIVES.containsKey(method.getReturnType())) {
                        methodTuples4.add(new MethodTuple(strMethodToParamName2, method, method.getReturnType()));
                    } else {
                        methodTuples3.add(new MethodTuple(strMethodToParamName2, method, method.getReturnType()));
                    }
                }
            }
            i2++;
            i = i3;
            methods = methodArr;
        }
        serializePrimitives(document, element, obj, methodTuples2, methodTuples4);
        serializeNonPrimitives(document, element, obj, methodTuples, methodTuples3);
    }

    private static void serializePrimitives(Document document, Element element, Object obj, MethodTuples methodTuples, MethodTuples methodTuples2) throws IllegalAccessException, DOMException, IllegalArgumentException, InvocationTargetException {
        Element elementCreateElement;
        Map.Entry<String, Set<MethodTuple>> entry;
        if (obj instanceof AbstractMultipleParser) {
            elementCreateElement = document.createElement("params");
            Element elementCreateElement2 = document.createElement("param");
            elementCreateElement2.setAttribute("name", "metadataPolicy");
            elementCreateElement2.setAttribute("value", ((AbstractMultipleParser) obj).getMetadataPolicy().toString());
            elementCreateElement.appendChild(elementCreateElement2);
            element.appendChild(elementCreateElement);
        } else {
            elementCreateElement = null;
        }
        Iterator<Map.Entry<String, Set<MethodTuple>>> it = methodTuples.tuples.entrySet().iterator();
        Element element2 = elementCreateElement;
        while (it.hasNext()) {
            Map.Entry<String, Set<MethodTuple>> next = it.next();
            if (methodTuples2.tuples.containsKey(next.getKey())) {
                Set<MethodTuple> set = methodTuples2.tuples.get(next.getKey());
                Set<MethodTuple> value = next.getValue();
                MethodTuple methodTuple = null;
                for (MethodTuple methodTuple2 : set) {
                    Iterator<MethodTuple> it2 = value.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            entry = next;
                            break;
                        }
                        entry = next;
                        if (methodTuple2.singleParam.equals(it2.next().singleParam)) {
                            methodTuple = methodTuple2;
                            break;
                        }
                        next = entry;
                    }
                    next = entry;
                }
                Map.Entry<String, Set<MethodTuple>> entry2 = next;
                if (methodTuple == null) {
                    LOG.OooOoO(entry2.getKey(), "Could not find getter to match setter for: {}");
                } else {
                    try {
                        Object objInvoke = methodTuple.method.invoke(obj, null);
                        if (objInvoke == null) {
                            LOG.OooOoOO("null value: {} in {}", methodTuple.name, obj.getClass());
                        }
                        String string = objInvoke == null ? "" : objInvoke.toString();
                        Element elementCreateElement3 = document.createElement("param");
                        elementCreateElement3.setAttribute("name", methodTuple.name);
                        elementCreateElement3.setAttribute("type", PRIMITIVES.get(methodTuple.singleParam));
                        if (List.class.isAssignableFrom(methodTuple.singleParam)) {
                            addList(elementCreateElement3, document, methodTuple, (List) objInvoke);
                        } else if (Map.class.isAssignableFrom(methodTuple.singleParam)) {
                            addMap(elementCreateElement3, document, methodTuple, (Map) objInvoke);
                        } else {
                            elementCreateElement3.setTextContent(string);
                        }
                        if (element2 == null) {
                            Element elementCreateElement4 = document.createElement("params");
                            element.appendChild(elementCreateElement4);
                            element2 = elementCreateElement4;
                        }
                        element2.appendChild(elementCreateElement3);
                    } catch (IllegalAccessException e) {
                        LOG.OooOOOO("couldn't invoke " + methodTuple, e);
                    } catch (InvocationTargetException e2) {
                        LOG.OooOOOO("couldn't invoke " + methodTuple, e2);
                    }
                }
            } else {
                LOG.OooOOO("no getter for setter: {} in {}", next.getKey(), obj.getClass());
            }
        }
    }

    private static Element addParser(Mode mode, Element element, Document document, Parser parser, ParserDecorator parserDecorator) throws Exception {
        ParseContext parseContext = new ParseContext();
        TreeSet treeSet = new TreeSet();
        TreeSet treeSet2 = new TreeSet();
        if (parserDecorator != null) {
            TreeSet treeSet3 = new TreeSet(parserDecorator.getSupportedTypes(parseContext));
            treeSet.addAll(treeSet3);
            for (MediaType mediaType : parser.getSupportedTypes(parseContext)) {
                if (!treeSet3.contains(mediaType)) {
                    treeSet2.add(mediaType);
                }
                treeSet.remove(mediaType);
            }
        } else if (mode == Mode.STATIC_FULL) {
            treeSet.addAll(parser.getSupportedTypes(parseContext));
        }
        String canonicalName = parser.getClass().getCanonicalName();
        Element elementCreateElement = document.createElement(ExternalParsersConfigReaderMetKeys.PARSER_TAG);
        elementCreateElement.setAttribute(Constants.CLASS, canonicalName);
        element.appendChild(elementCreateElement);
        serializeParams(document, elementCreateElement, parser);
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            MediaType mediaType2 = (MediaType) it.next();
            Element elementCreateElement2 = document.createElement("mime");
            elementCreateElement2.appendChild(document.createTextNode(mediaType2.toString()));
            elementCreateElement.appendChild(elementCreateElement2);
        }
        Iterator it2 = treeSet2.iterator();
        while (it2.hasNext()) {
            MediaType mediaType3 = (MediaType) it2.next();
            Element elementCreateElement3 = document.createElement("mime-exclude");
            elementCreateElement3.appendChild(document.createTextNode(mediaType3.toString()));
            elementCreateElement.appendChild(elementCreateElement3);
        }
        return elementCreateElement;
    }
}
