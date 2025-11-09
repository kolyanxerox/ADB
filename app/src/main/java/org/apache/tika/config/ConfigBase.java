package org.apache.tika.config;

import OooO0oO.OooOo;
import androidx.datastore.preferences.protobuf.OooO00o;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* loaded from: classes3.dex */
public abstract class ConfigBase {
    private static Class[] SUPPORTED_PRIMITIVES = {String.class, Boolean.TYPE, Long.TYPE, Integer.TYPE, Double.TYPE, Float.TYPE};

    public static class SetterClassPair {
        private final Class itemClass;
        private final Method setterMethod;

        public SetterClassPair(Method method, Class cls) {
            this.setterMethod = method;
            this.itemClass = cls;
        }

        public String toString() {
            return "SetterClassPair{setterMethod=" + this.setterMethod + ", itemClass=" + this.itemClass + "}";
        }
    }

    private static <T> T buildClass(Node node, String str, Class cls) throws DOMException, ClassNotFoundException, TikaConfigException {
        String name = cls.getName();
        Node namedItem = node.getAttributes().getNamedItem(Constants.CLASS);
        if (namedItem != null) {
            name = namedItem.getTextContent();
        }
        try {
            Class<?> cls2 = Class.forName(name);
            if (cls.isAssignableFrom(cls2)) {
                return (T) cls2.getDeclaredConstructor(null).newInstance(null);
            }
            throw new TikaConfigException(str + " with class name " + name + " must be of type '" + cls.getName() + "'");
        } catch (ClassNotFoundException e) {
            e = e;
            throw new TikaConfigException(OooO00o.OooOO0o("problem loading ", str, " with class ", cls.getName()), e);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new TikaConfigException(OooO00o.OooOO0o("problem loading ", str, " with class ", cls.getName()), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new TikaConfigException(OooO00o.OooOO0o("problem loading ", str, " with class ", cls.getName()), e);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new TikaConfigException(OooO00o.OooOO0o("problem loading ", str, " with class ", cls.getName()), e);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new TikaConfigException(OooO00o.OooOO0o("problem loading ", str, " with class ", cls.getName()), e);
        }
    }

    public static <P, T> P buildComposite(String str, Class<P> cls, String str2, Class<T> cls2, InputStream inputStream) throws IOException, TikaConfigException {
        try {
            return (P) buildComposite(str, cls, str2, cls2, XMLReaderUtils.buildDOM(inputStream).getDocumentElement());
        } catch (TikaException e) {
            throw new TikaConfigException("problem loading xml to dom", e);
        } catch (SAXException e2) {
            throw new IOException(e2);
        }
    }

    public static <T> T buildSingle(String str, Class<T> cls, InputStream inputStream) throws IOException, TikaConfigException {
        try {
            Element documentElement = XMLReaderUtils.buildDOM(inputStream).getDocumentElement();
            if (documentElement.getLocalName().equals("properties")) {
                return (T) buildSingle(str, cls, documentElement, null);
            }
            throw new TikaConfigException("expect properties as root node");
        } catch (TikaException e) {
            throw new TikaConfigException("problem loading xml to dom", e);
        } catch (SAXException e2) {
            throw new IOException(e2);
        }
    }

    private static SetterClassPair findSetterClassPair(Object obj, String str) throws SecurityException, TikaConfigException {
        String strOooOO0O = OooOo.OooOO0O("set", str.substring(0, 1).toUpperCase(Locale.US), str.substring(1));
        Method method = null;
        Class<?> cls = null;
        for (Method method2 : obj.getClass().getMethods()) {
            if (strOooOO0O.equals(method2.getName())) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (parameterTypes.length == 1 && (cls == null || parameterTypes[0].equals(String.class))) {
                    cls = parameterTypes[0];
                    method = method2;
                }
            }
        }
        if (method != null && cls != null) {
            return new SetterClassPair(method, cls);
        }
        String strOooOO0O2 = OooOo.OooOO0O("add", str.substring(0, 1).toUpperCase(Locale.US), str.substring(1));
        for (Method method3 : obj.getClass().getMethods()) {
            if (strOooOO0O2.equals(method3.getName())) {
                Class<?>[] parameterTypes2 = method3.getParameterTypes();
                if (parameterTypes2.length == 1 && (cls == null || parameterTypes2[0].equals(String.class))) {
                    cls = parameterTypes2[0];
                    method = method3;
                }
            }
        }
        if (method != null || cls != null) {
            return new SetterClassPair(method, cls);
        }
        Class<?> cls2 = obj.getClass();
        StringBuilder sbOooOOo0 = OooO00o.OooOOo0("Couldn't find setter '", strOooOO0O, "' or adder '", strOooOO0O2, "' for ");
        sbOooOOo0.append(str);
        sbOooOOo0.append(" of class: ");
        sbOooOOo0.append(cls2);
        throw new TikaConfigException(sbOooOOo0.toString());
    }

    private static boolean hasChildNodes(Node node) {
        if (!node.hasChildNodes()) {
            return false;
        }
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            if (childNodes.item(i).getNodeType() == 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasClass(Node node) {
        return node.hasAttributes() && node.getAttributes().getNamedItem(Constants.CLASS) != null;
    }

    private static boolean isMap(Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1 && nodeItem.hasAttributes()) {
                if (nodeItem.getAttributes().getNamedItem("from") != null && nodeItem.getAttributes().getNamedItem("to") != null) {
                    return true;
                }
                if (nodeItem.getAttributes().getNamedItem("k") != null && nodeItem.getAttributes().getNamedItem("v") != null) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isPrimitive(Class cls) {
        int i = 0;
        while (true) {
            Class[] clsArr = SUPPORTED_PRIMITIVES;
            if (i >= clsArr.length) {
                return false;
            }
            if (clsArr[i].equals(cls)) {
                return true;
            }
            i++;
        }
    }

    private static <T> List<T> loadComposite(Node node, String str, Class<? extends T> cls) throws IllegalAccessException, DOMException, ClassNotFoundException, SecurityException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        NodeList childNodes = node.getChildNodes();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1 && str.equals(nodeItem.getLocalName())) {
                Object objBuildClass = buildClass(nodeItem, str, cls);
                setParams(objBuildClass, nodeItem, new HashSet());
                arrayList.add(objBuildClass);
            }
        }
        return arrayList;
    }

    private static void setParams(Object obj, Node node, Set<String> set) throws IllegalAccessException, DOMException, SecurityException, ClassNotFoundException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        setParams(obj, node, set, null);
    }

    private static void tryToSetClassList(Object obj, Node node) throws IllegalAccessException, DOMException, ClassNotFoundException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        String localName = node.getLocalName();
        try {
            Class<?> cls = Class.forName(node.getAttributes().getNamedItem(Constants.CLASS).getTextContent());
            ArrayList arrayList = new ArrayList();
            NodeList childNodes = node.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node nodeItem = childNodes.item(i);
                if (nodeItem.getNodeType() == 1) {
                    Object objBuildClass = buildClass(nodeItem, nodeItem.getLocalName(), cls);
                    setParams(objBuildClass, nodeItem, new HashSet());
                    arrayList.add(objBuildClass);
                }
            }
            obj.getClass().getMethod("set" + localName.substring(0, 1).toUpperCase(Locale.US) + localName.substring(1), List.class).invoke(obj, arrayList);
        } catch (ClassNotFoundException e) {
            e = e;
            throw new TikaConfigException(OooOo.OooOO0("couldn't build class for ", localName), e);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new TikaConfigException(OooOo.OooOO0("couldn't build class for ", localName), e);
        } catch (NoSuchMethodException e3) {
            e = e3;
            throw new TikaConfigException(OooOo.OooOO0("couldn't build class for ", localName), e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw new TikaConfigException(OooOo.OooOO0("couldn't build class for ", localName), e);
        }
    }

    private static void tryToSetList(Object obj, Node node) throws IllegalAccessException, DOMException, ClassNotFoundException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        if (hasClass(node)) {
            tryToSetClassList(obj, node);
        } else {
            tryToSetStringList(obj, node);
        }
    }

    private static void tryToSetMap(Object obj, Node node) throws IllegalAccessException, DOMException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        String localName = node.getLocalName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1) {
                NamedNodeMap attributes = nodeItem.getAttributes();
                String textContent = null;
                String textContent2 = attributes.getNamedItem("from") != null ? attributes.getNamedItem("from").getTextContent() : attributes.getNamedItem("key") != null ? attributes.getNamedItem("key").getTextContent() : attributes.getNamedItem("k") != null ? attributes.getNamedItem("k").getTextContent() : null;
                if (attributes.getNamedItem("to") != null) {
                    textContent = attributes.getNamedItem("to").getTextContent();
                } else if (attributes.getNamedItem("value") != null) {
                    textContent = attributes.getNamedItem("value").getTextContent();
                } else if (attributes.getNamedItem("v") != null) {
                    textContent = attributes.getNamedItem("v").getTextContent();
                }
                if (textContent2 == null) {
                    throw new TikaConfigException("must specify a 'key' or 'from' value in a map object : " + node);
                }
                if (textContent == null) {
                    throw new TikaConfigException("must specify a 'value' or 'to' value in a map object : " + node);
                }
                linkedHashMap.put(textContent2, textContent);
            }
        }
        try {
            obj.getClass().getMethod(OooOo.OooOO0O("set", localName.substring(0, 1).toUpperCase(Locale.US), localName.substring(1)), Map.class).invoke(obj, linkedHashMap);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new TikaConfigException("can't set ".concat(localName), e);
        }
    }

    private static void tryToSetPrimitive(Object obj, SetterClassPair setterClassPair, String str) throws IllegalAccessException, IllegalArgumentException, TikaConfigException, InvocationTargetException {
        try {
            if (setterClassPair.itemClass == Integer.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Integer.valueOf(Integer.parseInt(str)));
                return;
            }
            if (setterClassPair.itemClass == Long.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Long.valueOf(Long.parseLong(str)));
                return;
            }
            if (setterClassPair.itemClass == Float.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Float.valueOf(Float.parseFloat(str)));
                return;
            }
            if (setterClassPair.itemClass == Double.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Double.valueOf(Double.parseDouble(str)));
            } else if (setterClassPair.itemClass == Boolean.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Boolean.valueOf(Boolean.parseBoolean(str)));
            } else {
                setterClassPair.setterMethod.invoke(obj, str);
            }
        } catch (IllegalAccessException e) {
            e = e;
            throw new TikaConfigException("bad parameter " + setterClassPair + StringUtils.SPACE + str, e);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw new TikaConfigException("bad parameter " + setterClassPair + StringUtils.SPACE + str, e);
        }
    }

    private static void tryToSetStringList(Object obj, Node node) throws IllegalAccessException, IllegalArgumentException, TikaConfigException, InvocationTargetException {
        String textContent;
        String localName = node.getLocalName();
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1 && (textContent = nodeItem.getTextContent()) != null) {
                arrayList.add(textContent);
            }
        }
        try {
            obj.getClass().getMethod(OooOo.OooOO0O("set", localName.substring(0, 1).toUpperCase(Locale.US), localName.substring(1)), List.class).invoke(obj, arrayList);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new TikaConfigException("can't set ".concat(localName), e);
        }
    }

    public Set<String> configure(String str, InputStream inputStream) throws IllegalAccessException, DOMException, SecurityException, ClassNotFoundException, IOException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        HashSet hashSet = new HashSet();
        try {
            Element documentElement = XMLReaderUtils.buildDOM(inputStream).getDocumentElement();
            if (!documentElement.getLocalName().equals("properties")) {
                throw new TikaConfigException("expect properties as root node");
            }
            NodeList childNodes = documentElement.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node nodeItem = childNodes.item(i);
                if (str.equals(nodeItem.getLocalName())) {
                    setParams(this, nodeItem, hashSet);
                }
            }
            return hashSet;
        } catch (TikaException e) {
            throw new TikaConfigException("problem loading xml to dom", e);
        } catch (SAXException e2) {
            throw new IOException(e2);
        }
    }

    public void handleSettings(Set<String> set) {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void setParams(java.lang.Object r9, org.w3c.dom.Node r10, java.util.Set<java.lang.String> r11, java.lang.String r12) throws java.lang.IllegalAccessException, org.w3c.dom.DOMException, java.lang.SecurityException, java.lang.ClassNotFoundException, org.apache.tika.exception.TikaConfigException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            org.w3c.dom.NodeList r10 = r10.getChildNodes()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        Lb:
            int r3 = r10.getLength()
            if (r2 >= r3) goto L3c
            org.w3c.dom.Node r3 = r10.item(r2)
            java.lang.String r4 = r3.getLocalName()
            java.lang.String r5 = "params"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L36
            org.w3c.dom.NodeList r3 = r3.getChildNodes()
            r4 = r1
        L26:
            int r5 = r3.getLength()
            if (r4 >= r5) goto L39
            org.w3c.dom.Node r5 = r3.item(r4)
            r0.add(r5)
            int r4 = r4 + 1
            goto L26
        L36:
            r0.add(r3)
        L39:
            int r2 = r2 + 1
            goto Lb
        L3c:
            int r10 = r0.size()
            if (r1 >= r10) goto Le5
            java.lang.Object r10 = r0.get(r1)
            org.w3c.dom.Node r10 = (org.w3c.dom.Node) r10
            short r2 = r10.getNodeType()
            r3 = 1
            if (r2 == r3) goto L51
            goto Le1
        L51:
            java.lang.String r2 = r10.getLocalName()
            if (r2 == 0) goto Le1
            boolean r3 = r2.equals(r12)
            if (r3 == 0) goto L5f
            goto Le1
        L5f:
            java.lang.String r3 = r10.getTextContent()
            java.lang.String r4 = r10.getLocalName()
            org.apache.tika.config.ConfigBase$SetterClassPair r5 = findSetterClassPair(r9, r4)
            boolean r6 = hasClass(r10)
            if (r6 != 0) goto L97
            java.lang.Class r6 = org.apache.tika.config.ConfigBase.SetterClassPair.OooO00o(r5)
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            boolean r6 = r6.isAssignableFrom(r7)
            if (r6 == 0) goto L87
            boolean r6 = isMap(r10)
            if (r6 == 0) goto L87
            tryToSetMap(r9, r10)
            goto Lcc
        L87:
            java.lang.Class r6 = org.apache.tika.config.ConfigBase.SetterClassPair.OooO00o(r5)
            java.lang.Class<java.util.List> r7 = java.util.List.class
            boolean r6 = r6.isAssignableFrom(r7)
            if (r6 == 0) goto L97
            tryToSetList(r9, r10)
            goto Lcc
        L97:
            java.lang.Class r6 = org.apache.tika.config.ConfigBase.SetterClassPair.OooO00o(r5)
            boolean r6 = isPrimitive(r6)
            if (r6 == 0) goto La9
            java.lang.String r10 = r10.getTextContent()
            tryToSetPrimitive(r9, r5, r10)
            goto Lcc
        La9:
            java.lang.Class r6 = org.apache.tika.config.ConfigBase.SetterClassPair.OooO00o(r5)
            java.lang.Object r6 = buildClass(r10, r4, r6)
            java.lang.Class r7 = org.apache.tika.config.ConfigBase.SetterClassPair.OooO00o(r5)
            java.lang.Object r7 = r7.cast(r6)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            setParams(r7, r10, r8)
            java.lang.reflect.Method r10 = org.apache.tika.config.ConfigBase.SetterClassPair.OooO0O0(r5)     // Catch: java.lang.reflect.InvocationTargetException -> Ld2 java.lang.IllegalAccessException -> Ld4
            java.lang.Object[] r5 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> Ld2 java.lang.IllegalAccessException -> Ld4
            r10.invoke(r9, r5)     // Catch: java.lang.reflect.InvocationTargetException -> Ld2 java.lang.IllegalAccessException -> Ld4
        Lcc:
            if (r3 == 0) goto Le1
            r11.add(r2)
            goto Le1
        Ld2:
            r9 = move-exception
            goto Ld5
        Ld4:
            r9 = move-exception
        Ld5:
            org.apache.tika.exception.TikaConfigException r10 = new org.apache.tika.exception.TikaConfigException
            java.lang.String r11 = "problem creating "
            java.lang.String r11 = OooO0oO.OooOo.OooOO0(r11, r4)
            r10.<init>(r11, r9)
            throw r10
        Le1:
            int r1 = r1 + 1
            goto L3c
        Le5:
            boolean r10 = r9 instanceof org.apache.tika.config.Initializable
            if (r10 == 0) goto Lf5
            org.apache.tika.config.Initializable r9 = (org.apache.tika.config.Initializable) r9
            java.util.Map r10 = java.util.Collections.EMPTY_MAP
            r9.initialize(r10)
            org.apache.tika.config.InitializableProblemHandler r10 = org.apache.tika.config.InitializableProblemHandler.THROW
            r9.checkInitialization(r10)
        Lf5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.config.ConfigBase.setParams(java.lang.Object, org.w3c.dom.Node, java.util.Set, java.lang.String):void");
    }

    public static <P, T> P buildComposite(String str, Class<P> cls, String str2, Class<T> cls2, Element element) throws IllegalAccessException, DOMException, InstantiationException, ClassNotFoundException, SecurityException, IOException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        if (element.getLocalName().equals("properties")) {
            NodeList childNodes = element.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node nodeItem = childNodes.item(i);
                if (nodeItem.getNodeType() == 1 && str.equals(nodeItem.getLocalName())) {
                    try {
                        P pNewInstance = cls.getConstructor(List.class).newInstance(loadComposite(nodeItem, str2, cls2));
                        setParams(pNewInstance, nodeItem, new HashSet(), str2);
                        return pNewInstance;
                    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                        throw new TikaConfigException("can't build composite class", e);
                    }
                }
            }
            throw new TikaConfigException(OooOo.OooOO0("could not find ", str));
        }
        throw new TikaConfigException("expect properties as root node");
    }

    public static <T> T buildSingle(String str, Class<T> cls, Element element, T t) throws IllegalAccessException, DOMException, SecurityException, ClassNotFoundException, IOException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        NodeList childNodes = element.getChildNodes();
        T t2 = null;
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1 && str.equals(nodeItem.getLocalName())) {
                if (t2 == null) {
                    t2 = (T) buildClass(nodeItem, str, cls);
                    setParams(t2, nodeItem, new HashSet());
                } else {
                    throw new TikaConfigException(OooOo.OooOO0O("There can only be one ", str, " in a config"));
                }
            }
        }
        if (t2 != null) {
            return t2;
        }
        if (t != null) {
            return t;
        }
        throw new TikaConfigException(OooOo.OooOO0("could not find ", str));
    }
}
