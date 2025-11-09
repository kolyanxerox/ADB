package org.apache.tika.config;

import OooO0oO.OooOo;
import androidx.datastore.preferences.protobuf.OooO00o;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import o0oOO.OooO0O0;
import o0oOO.OooO0o;
import org.apache.tika.concurrent.ConfigurableThreadPoolExecutor;
import org.apache.tika.concurrent.SimpleThreadPoolExecutor;
import org.apache.tika.detect.CompositeDetector;
import org.apache.tika.detect.CompositeEncodingDetector;
import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.DefaultEncodingDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.detect.EncodingDetector;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.language.translate.DefaultTranslator;
import org.apache.tika.language.translate.Translator;
import org.apache.tika.metadata.filter.MetadataFilter;
import org.apache.tika.metadata.filter.NoOpFilter;
import org.apache.tika.metadata.listfilter.MetadataListFilter;
import org.apache.tika.metadata.listfilter.NoOpListFilter;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.mime.MimeTypeException;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.mime.MimeTypesFactory;
import org.apache.tika.parser.AbstractEncodingDetectorParser;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.AutoDetectParserConfig;
import org.apache.tika.parser.CompositeParser;
import org.apache.tika.parser.DefaultParser;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.ParserDecorator;
import org.apache.tika.parser.RenderingParser;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.parser.multiple.AbstractMultipleParser;
import org.apache.tika.renderer.CompositeRenderer;
import org.apache.tika.renderer.Renderer;
import org.apache.tika.utils.AnnotationUtils;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* loaded from: classes3.dex */
public class TikaConfig {
    public static int DEFAULT_MAX_JSON_STRING_FIELD_LENGTH = 20000000;
    private static int MAX_JSON_STRING_FIELD_LENGTH = 0;
    public static String MAX_JSON_STRING_FIELD_LENGTH_ELEMENT_NAME = "maxJsonStringFieldLength";
    private static final Map<String, InitializableProblemHandler> strategyMap;
    private final AutoDetectParserConfig autoDetectParserConfig;
    private final CompositeDetector detector;
    private final EncodingDetector encodingDetector;
    private final ExecutorService executorService;
    private final MetadataFilter metadataFilter;
    private final MetadataListFilter metadataListFilter;
    private final MimeTypes mimeTypes;
    private final CompositeParser parser;
    private final Renderer renderer;
    private final ServiceLoader serviceLoader;
    private final Translator translator;
    protected static final AtomicInteger TIMES_INSTANTIATED = new AtomicInteger();
    private static final OooO0O0 LOG = OooO0o.OooO0O0(TikaConfig.class);

    public static class DetectorXmlLoader extends XmlLoader<CompositeDetector, Detector> {
        public /* synthetic */ DetectorXmlLoader(int i) {
            this();
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public /* bridge */ /* synthetic */ Detector createComposite(Class<? extends Detector> cls, List<Detector> list, Set<Class<? extends Detector>> set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return createComposite2(cls, list, set, (Map<String, Param>) map, mimeTypes, serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Detector decorate(Detector detector, Element element) {
            return detector;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Class<? extends Detector> getLoaderClass() {
            return Detector.class;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getLoaderTagName() {
            return "detector";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getParentTagName() {
            return "detectors";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean supportsComposite() {
            return true;
        }

        private DetectorXmlLoader() {
            super(0);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public CompositeDetector createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.getDefaultDetector(mimeTypes, serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Detector detector) {
            return detector instanceof CompositeDetector;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Detector preLoadOne(Class<? extends Detector> cls, String str, MimeTypes mimeTypes) {
            if (MimeTypes.class.equals(cls)) {
                return mimeTypes;
            }
            return null;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public CompositeDetector createComposite(List<Detector> list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return new CompositeDetector(mimeTypes.getMediaTypeRegistry(), list);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Class<? extends Detector> cls) {
            return CompositeDetector.class.isAssignableFrom(cls);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        /* renamed from: createComposite */
        public Detector createComposite2(Class<? extends Detector> cls, List<Detector> list, Set<Class<? extends Detector>> set, Map<String, Param> map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            Detector detectorNewInstance;
            MediaTypeRegistry mediaTypeRegistry = mimeTypes.getMediaTypeRegistry();
            try {
                detectorNewInstance = cls.getConstructor(MimeTypes.class, ServiceLoader.class, Collection.class).newInstance(mimeTypes, serviceLoader, set);
            } catch (NoSuchMethodException unused) {
                detectorNewInstance = null;
            }
            if (detectorNewInstance == null) {
                try {
                    detectorNewInstance = cls.getConstructor(MediaTypeRegistry.class, List.class, Collection.class).newInstance(mediaTypeRegistry, list, set);
                } catch (NoSuchMethodException unused2) {
                }
            }
            if (detectorNewInstance == null) {
                try {
                    detectorNewInstance = cls.getConstructor(MediaTypeRegistry.class, List.class).newInstance(mediaTypeRegistry, list);
                } catch (NoSuchMethodException unused3) {
                }
            }
            if (detectorNewInstance != null) {
                return detectorNewInstance;
            }
            try {
                return cls.getConstructor(List.class).newInstance(list);
            } catch (NoSuchMethodException unused4) {
                return detectorNewInstance;
            }
        }
    }

    public static class EncodingDetectorXmlLoader extends XmlLoader<EncodingDetector, EncodingDetector> {
        public /* synthetic */ EncodingDetectorXmlLoader(int i) {
            this();
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public /* bridge */ /* synthetic */ EncodingDetector createComposite(Class<? extends EncodingDetector> cls, List<EncodingDetector> list, Set<Class<? extends EncodingDetector>> set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return createComposite2(cls, list, set, (Map<String, Param>) map, mimeTypes, serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public EncodingDetector decorate(EncodingDetector encodingDetector, Element element) {
            return encodingDetector;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Class<? extends EncodingDetector> getLoaderClass() {
            return EncodingDetector.class;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getLoaderTagName() {
            return "encodingDetector";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getParentTagName() {
            return "encodingDetectors";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public EncodingDetector preLoadOne(Class<? extends EncodingDetector> cls, String str, MimeTypes mimeTypes) {
            return null;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean supportsComposite() {
            return true;
        }

        private EncodingDetectorXmlLoader() {
            super(0);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public EncodingDetector createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.getDefaultEncodingDetector(serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(EncodingDetector encodingDetector) {
            return encodingDetector instanceof CompositeEncodingDetector;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public EncodingDetector createComposite(List<EncodingDetector> list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return new CompositeEncodingDetector(list);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Class<? extends EncodingDetector> cls) {
            return CompositeEncodingDetector.class.isAssignableFrom(cls);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        /* renamed from: createComposite */
        public EncodingDetector createComposite2(Class<? extends EncodingDetector> cls, List<EncodingDetector> list, Set<Class<? extends EncodingDetector>> set, Map<String, Param> map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            EncodingDetector encodingDetectorNewInstance;
            try {
                encodingDetectorNewInstance = cls.getConstructor(ServiceLoader.class, Collection.class).newInstance(serviceLoader, set);
            } catch (NoSuchMethodException unused) {
                TikaConfig.LOG.OooOoO(cls, "couldn't find constructor for service loader + collection for {}");
                encodingDetectorNewInstance = null;
            }
            if (encodingDetectorNewInstance != null) {
                return encodingDetectorNewInstance;
            }
            try {
                return cls.getConstructor(List.class).newInstance(list);
            } catch (NoSuchMethodException unused2) {
                TikaConfig.LOG.OooOoO(cls, "couldn't find constructor for EncodingDetector(List) for {}");
                return encodingDetectorNewInstance;
            }
        }
    }

    public static class ExecutorServiceXmlLoader extends XmlLoader<ConfigurableThreadPoolExecutor, ConfigurableThreadPoolExecutor> {
        public /* synthetic */ ExecutorServiceXmlLoader(int i) {
            this();
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public /* bridge */ /* synthetic */ ConfigurableThreadPoolExecutor createComposite(Class<? extends ConfigurableThreadPoolExecutor> cls, List<ConfigurableThreadPoolExecutor> list, Set<Class<? extends ConfigurableThreadPoolExecutor>> set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return createComposite2(cls, list, set, (Map<String, Param>) map, mimeTypes, serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Class<? extends ConfigurableThreadPoolExecutor> getLoaderClass() {
            return ConfigurableThreadPoolExecutor.class;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getLoaderTagName() {
            return "executor-service";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getParentTagName() {
            return null;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Class<? extends ConfigurableThreadPoolExecutor> cls) {
            return false;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public ConfigurableThreadPoolExecutor preLoadOne(Class<? extends ConfigurableThreadPoolExecutor> cls, String str, MimeTypes mimeTypes) {
            return null;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean supportsComposite() {
            return false;
        }

        private ExecutorServiceXmlLoader() {
            super(0);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public ConfigurableThreadPoolExecutor createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.getDefaultExecutorService();
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public ConfigurableThreadPoolExecutor decorate(ConfigurableThreadPoolExecutor configurableThreadPoolExecutor, Element element) {
            Element child = TikaConfig.getChild(element, "max-threads");
            if (child != null) {
                configurableThreadPoolExecutor.setMaximumPoolSize(Integer.parseInt(TikaConfig.getText(child)));
            }
            Element child2 = TikaConfig.getChild(element, "core-threads");
            if (child2 != null) {
                configurableThreadPoolExecutor.setCorePoolSize(Integer.parseInt(TikaConfig.getText(child2)));
            }
            return configurableThreadPoolExecutor;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(ConfigurableThreadPoolExecutor configurableThreadPoolExecutor) {
            return false;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public ConfigurableThreadPoolExecutor loadOne(Element element, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws TikaException, IOException {
            return (ConfigurableThreadPoolExecutor) super.loadOne(element, mimeTypes, serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        /* renamed from: createComposite */
        public ConfigurableThreadPoolExecutor createComposite2(Class<? extends ConfigurableThreadPoolExecutor> cls, List<ConfigurableThreadPoolExecutor> list, Set<Class<? extends ConfigurableThreadPoolExecutor>> set, Map<String, Param> map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws InstantiationException {
            throw new InstantiationException("Only one executor service supported");
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public ConfigurableThreadPoolExecutor createComposite(List<ConfigurableThreadPoolExecutor> list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return list.get(0);
        }
    }

    public static class ParserXmlLoader extends XmlLoader<CompositeParser, Parser> {
        private final EncodingDetector encodingDetector;
        private final Renderer renderer;

        public /* synthetic */ ParserXmlLoader(EncodingDetector encodingDetector, Renderer renderer, int i) {
            this(encodingDetector, renderer);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public /* bridge */ /* synthetic */ Parser createComposite(Class<? extends Parser> cls, List<Parser> list, Set<Class<? extends Parser>> set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return createComposite2(cls, list, set, (Map<String, Param>) map, mimeTypes, serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Class<? extends Parser> getLoaderClass() {
            return Parser.class;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getLoaderTagName() {
            return ExternalParsersConfigReaderMetKeys.PARSER_TAG;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getParentTagName() {
            return "parsers";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean supportsComposite() {
            return true;
        }

        private ParserXmlLoader(EncodingDetector encodingDetector, Renderer renderer) {
            super(0);
            this.encodingDetector = encodingDetector;
            this.renderer = renderer;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public CompositeParser createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.getDefaultParser(mimeTypes, serviceLoader, this.encodingDetector, this.renderer);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Parser decorate(Parser parser, Element element) throws TikaException {
            Set setMediaTypesListFromDomElement = TikaConfig.mediaTypesListFromDomElement(element, "mime");
            if (!setMediaTypesListFromDomElement.isEmpty()) {
                parser = ParserDecorator.withTypes(parser, setMediaTypesListFromDomElement);
            }
            Set setMediaTypesListFromDomElement2 = TikaConfig.mediaTypesListFromDomElement(element, "mime-exclude");
            return !setMediaTypesListFromDomElement2.isEmpty() ? ParserDecorator.withoutTypes(parser, setMediaTypesListFromDomElement2) : parser;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Parser parser) {
            return parser instanceof CompositeParser;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Parser newInstance(Class<? extends Parser> cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
            Parser parserNewInstance = AbstractEncodingDetectorParser.class.isAssignableFrom(cls) ? cls.getConstructor(EncodingDetector.class).newInstance(this.encodingDetector) : cls.getDeclaredConstructor(null).newInstance(null);
            if (parserNewInstance instanceof RenderingParser) {
                ((RenderingParser) parserNewInstance).setRenderer(this.renderer);
            }
            return parserNewInstance;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Parser preLoadOne(Class<? extends Parser> cls, String str, MimeTypes mimeTypes) throws TikaException {
            if (AutoDetectParser.class.isAssignableFrom(cls)) {
                throw new TikaException(OooOo.OooOO0("AutoDetectParser not supported in a <parser> configuration element: ", str));
            }
            return null;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public CompositeParser createComposite(List<Parser> list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return new CompositeParser(mimeTypes.getMediaTypeRegistry(), list);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Class<? extends Parser> cls) {
            return CompositeParser.class.isAssignableFrom(cls) || AbstractMultipleParser.class.isAssignableFrom(cls) || ParserDecorator.class.isAssignableFrom(cls);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        /* renamed from: createComposite */
        public Parser createComposite2(Class<? extends Parser> cls, List<Parser> list, Set<Class<? extends Parser>> set, Map<String, Param> map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            Parser parserNewInstance;
            CompositeParser compositeParser;
            MediaTypeRegistry mediaTypeRegistry = mimeTypes.getMediaTypeRegistry();
            try {
                parserNewInstance = cls.getConstructor(MediaTypeRegistry.class, ServiceLoader.class, Collection.class, EncodingDetector.class, Renderer.class).newInstance(mediaTypeRegistry, serviceLoader, set, this.encodingDetector, this.renderer);
            } catch (NoSuchMethodException unused) {
                parserNewInstance = null;
            }
            if (parserNewInstance == null) {
                try {
                    parserNewInstance = cls.getConstructor(MediaTypeRegistry.class, ServiceLoader.class, Collection.class, EncodingDetector.class).newInstance(mediaTypeRegistry, serviceLoader, set, this.encodingDetector);
                } catch (NoSuchMethodException unused2) {
                }
            }
            if (parserNewInstance == null) {
                try {
                    parserNewInstance = cls.getConstructor(MediaTypeRegistry.class, ServiceLoader.class, Collection.class).newInstance(mediaTypeRegistry, serviceLoader, set);
                } catch (NoSuchMethodException unused3) {
                }
            }
            if (parserNewInstance == null) {
                try {
                    parserNewInstance = cls.getConstructor(MediaTypeRegistry.class, List.class, Collection.class).newInstance(mediaTypeRegistry, list, set);
                } catch (NoSuchMethodException unused4) {
                }
            }
            if (parserNewInstance == null) {
                try {
                    parserNewInstance = cls.getConstructor(MediaTypeRegistry.class, Collection.class, Map.class).newInstance(mediaTypeRegistry, list, map);
                } catch (NoSuchMethodException unused5) {
                }
            }
            if (parserNewInstance == null) {
                try {
                    parserNewInstance = cls.getConstructor(MediaTypeRegistry.class, List.class).newInstance(mediaTypeRegistry, list);
                } catch (NoSuchMethodException unused6) {
                }
            }
            if (parserNewInstance != null || !ParserDecorator.class.isAssignableFrom(cls)) {
                return parserNewInstance;
            }
            try {
                if (list.size() == 1 && set.isEmpty() && (list.get(0) instanceof CompositeParser)) {
                    compositeParser = (CompositeParser) list.get(0);
                } else {
                    compositeParser = new CompositeParser(mediaTypeRegistry, list, set);
                }
                return cls.getConstructor(Parser.class).newInstance(compositeParser);
            } catch (NoSuchMethodException unused7) {
                return parserNewInstance;
            }
        }
    }

    public static class RendererXmlLoader extends XmlLoader<Renderer, Renderer> {
        public /* synthetic */ RendererXmlLoader(int i) {
            this();
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public /* bridge */ /* synthetic */ Renderer createComposite(Class<? extends Renderer> cls, List<Renderer> list, Set<Class<? extends Renderer>> set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return createComposite2(cls, list, set, (Map<String, Param>) map, mimeTypes, serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Renderer decorate(Renderer renderer, Element element) {
            return renderer;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Class<? extends Renderer> getLoaderClass() {
            return Renderer.class;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getLoaderTagName() {
            return "renderer";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getParentTagName() {
            return "renderers";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Renderer preLoadOne(Class<? extends Renderer> cls, String str, MimeTypes mimeTypes) {
            return null;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean supportsComposite() {
            return true;
        }

        private RendererXmlLoader() {
            super(0);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Renderer createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.getDefaultRenderer(serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Renderer renderer) {
            return renderer instanceof CompositeRenderer;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Renderer createComposite(List<Renderer> list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return new CompositeRenderer(list);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Class<? extends Renderer> cls) {
            return CompositeRenderer.class.isAssignableFrom(cls);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        /* renamed from: createComposite */
        public Renderer createComposite2(Class<? extends Renderer> cls, List<Renderer> list, Set<Class<? extends Renderer>> set, Map<String, Param> map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            Renderer rendererNewInstance;
            try {
                rendererNewInstance = cls.getConstructor(ServiceLoader.class, Collection.class).newInstance(serviceLoader, set);
            } catch (NoSuchMethodException unused) {
                TikaConfig.LOG.OooOoO(null, "couldn't find constructor for service loader + collection for {}");
                rendererNewInstance = null;
            }
            if (rendererNewInstance != null) {
                return rendererNewInstance;
            }
            try {
                return cls.getConstructor(List.class).newInstance(list);
            } catch (NoSuchMethodException unused2) {
                TikaConfig.LOG.OooOoO(cls, "couldn't find constructor for Renderer(List) for {}");
                return rendererNewInstance;
            }
        }
    }

    public static class TranslatorXmlLoader extends XmlLoader<Translator, Translator> {
        public /* synthetic */ TranslatorXmlLoader(int i) {
            this();
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public /* bridge */ /* synthetic */ Translator createComposite(Class<? extends Translator> cls, List<Translator> list, Set<Class<? extends Translator>> set, Map map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return createComposite2(cls, list, set, (Map<String, Param>) map, mimeTypes, serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Translator decorate(Translator translator, Element element) {
            return translator;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Class<? extends Translator> getLoaderClass() {
            return Translator.class;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getLoaderTagName() {
            return "translator";
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public String getParentTagName() {
            return null;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Class<? extends Translator> cls) {
            return false;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Translator preLoadOne(Class<? extends Translator> cls, String str, MimeTypes mimeTypes) {
            return null;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean supportsComposite() {
            return false;
        }

        private TranslatorXmlLoader() {
            super(0);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Translator createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return TikaConfig.getDefaultTranslator(serviceLoader);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public boolean isComposite(Translator translator) {
            return false;
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        public Translator createComposite(List<Translator> list, MimeTypes mimeTypes, ServiceLoader serviceLoader) {
            return list.get(0);
        }

        @Override // org.apache.tika.config.TikaConfig.XmlLoader
        /* renamed from: createComposite */
        public Translator createComposite2(Class<? extends Translator> cls, List<Translator> list, Set<Class<? extends Translator>> set, Map<String, Param> map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws InstantiationException {
            throw new InstantiationException("Only one translator supported");
        }
    }

    public static abstract class XmlLoader<CT, T> {
        protected static final String PARAMS_TAG_NAME = "params";

        public /* synthetic */ XmlLoader(int i) {
            this();
        }

        public abstract T createComposite(Class<? extends T> cls, List<T> list, Set<Class<? extends T>> set, Map<String, Param> map, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws IllegalAccessException, InstantiationException, InvocationTargetException;

        public abstract CT createComposite(List<T> list, MimeTypes mimeTypes, ServiceLoader serviceLoader);

        public abstract CT createDefault(MimeTypes mimeTypes, ServiceLoader serviceLoader);

        public abstract T decorate(T t, Element element) throws TikaException, IOException;

        public abstract Class<? extends T> getLoaderClass();

        public abstract String getLoaderTagName();

        public Map<String, Param> getParams(Element element) throws IllegalAccessException, TikaException, NoSuchMethodException, DOMException, SecurityException, IllegalArgumentException, InvocationTargetException {
            HashMap map = new HashMap();
            Node firstChild = element.getFirstChild();
            while (true) {
                if (firstChild == null) {
                    break;
                }
                if (!"params".equals(firstChild.getNodeName())) {
                    firstChild = firstChild.getNextSibling();
                } else if (firstChild.hasChildNodes()) {
                    NodeList childNodes = firstChild.getChildNodes();
                    for (int i = 0; i < childNodes.getLength(); i++) {
                        Node nodeItem = childNodes.item(i);
                        if (nodeItem.getNodeType() == 1) {
                            Param paramLoad = Param.load(nodeItem);
                            map.put(paramLoad.getName(), paramLoad);
                        }
                    }
                }
            }
            return map;
        }

        public abstract String getParentTagName();

        public abstract boolean isComposite(Class<? extends T> cls);

        public abstract boolean isComposite(T t);

        public T loadOne(Element element, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws TikaException, IOException {
            InitializableProblemHandler initializableProblemHandler;
            T tNewInstance;
            MimeTypes mimeTypes2 = mimeTypes;
            ServiceLoader serviceLoader2 = serviceLoader;
            String attribute = element.getAttribute(Constants.CLASS);
            int length = attribute.length();
            int i = 0;
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = attribute.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    String attribute2 = element.getAttribute("initializableProblemHandler");
                    int length2 = attribute2.length();
                    int iCharCount2 = i;
                    while (true) {
                        if (iCharCount2 >= length2) {
                            initializableProblemHandler = serviceLoader2.getInitializableProblemHandler();
                            break;
                        }
                        int iCodePointAt2 = attribute2.codePointAt(iCharCount2);
                        if (!Character.isWhitespace(iCodePointAt2)) {
                            initializableProblemHandler = TikaConfig.getInitializableProblemHandler(attribute2);
                            break;
                        }
                        iCharCount2 += Character.charCount(iCodePointAt2);
                    }
                    InitializableProblemHandler initializableProblemHandler2 = initializableProblemHandler;
                    try {
                        try {
                            Class<? extends T> serviceClass = serviceLoader2.getServiceClass(getLoaderClass(), attribute);
                            T tPreLoadOne = preLoadOne(serviceClass, attribute, mimeTypes2);
                            if (tPreLoadOne != null) {
                                return tPreLoadOne;
                            }
                            try {
                                Map<String, Param> params = getParams(element);
                                if (isComposite((Class) serviceClass)) {
                                    ArrayList arrayList = new ArrayList();
                                    NodeList elementsByTagName = element.getElementsByTagName(getLoaderTagName());
                                    if (elementsByTagName.getLength() > 0) {
                                        for (int i2 = i; i2 < elementsByTagName.getLength(); i2++) {
                                            T tLoadOne = loadOne((Element) elementsByTagName.item(i2), mimeTypes2, serviceLoader2);
                                            if (tLoadOne != null) {
                                                arrayList.add(tLoadOne);
                                            }
                                        }
                                    }
                                    HashSet hashSet = new HashSet();
                                    NodeList elementsByTagName2 = element.getElementsByTagName(getLoaderTagName() + "-exclude");
                                    if (elementsByTagName2.getLength() > 0) {
                                        for (int i3 = i; i3 < elementsByTagName2.getLength(); i3++) {
                                            String attribute3 = ((Element) elementsByTagName2.item(i3)).getAttribute(Constants.CLASS);
                                            try {
                                                hashSet.add(serviceLoader2.getServiceClass(getLoaderClass(), attribute3));
                                            } catch (ClassNotFoundException unused) {
                                                throw new TikaConfigException("Class not found in -exclude list: " + attribute3);
                                            }
                                        }
                                    }
                                    tNewInstance = createComposite(serviceClass, arrayList, hashSet, params, mimeTypes2, serviceLoader2);
                                    if (tNewInstance == null) {
                                        tNewInstance = newInstance(serviceClass);
                                    }
                                } else {
                                    tNewInstance = newInstance(serviceClass);
                                }
                                AnnotationUtils.assignFieldParams(tNewInstance, params);
                                if (tNewInstance instanceof Initializable) {
                                    ((Initializable) tNewInstance).initialize(params);
                                    ((Initializable) tNewInstance).checkInitialization(initializableProblemHandler2);
                                }
                                return decorate(tNewInstance, element);
                            } catch (Exception e) {
                                throw new TikaConfigException(e.getMessage(), e);
                            }
                        } catch (IllegalAccessException e2) {
                            throw new TikaException(OooO00o.OooOO0o("Unable to access a ", getLoaderTagName(), " class: ", attribute), e2);
                        } catch (InstantiationException e3) {
                            throw new TikaException(OooO00o.OooOO0o("Unable to instantiate a ", getLoaderTagName(), " class: ", attribute), e3);
                        } catch (NoSuchMethodException e4) {
                            throw new TikaException(OooO00o.OooOO0o("Unable to find the right constructor for ", getLoaderTagName(), " class: ", attribute), e4);
                        } catch (InvocationTargetException e5) {
                            throw new TikaException(OooO00o.OooOO0o("Unable to create a ", getLoaderTagName(), " class: ", attribute), e5);
                        }
                    } catch (ClassNotFoundException e6) {
                        if (serviceLoader.getLoadErrorHandler() == LoadErrorHandler.THROW) {
                            throw new TikaConfigException(OooO00o.OooOO0o("Unable to find a ", getLoaderTagName(), " class: ", attribute), e6);
                        }
                        serviceLoader.getLoadErrorHandler().handleLoadError(attribute, e6);
                        return null;
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
                mimeTypes2 = mimeTypes;
                serviceLoader2 = serviceLoader;
                i = i;
            }
            throw new TikaConfigException("class attribute must not be empty: " + element);
        }

        public CT loadOverall(Element element, MimeTypes mimeTypes, ServiceLoader serviceLoader) throws TikaException, IOException {
            ArrayList arrayList = new ArrayList();
            Iterator it = TikaConfig.getTopLevelElementChildren(element, getParentTagName(), getLoaderTagName()).iterator();
            while (it.hasNext()) {
                T tLoadOne = loadOne((Element) it.next(), mimeTypes, serviceLoader);
                if (tLoadOne != null) {
                    arrayList.add(tLoadOne);
                }
            }
            if (arrayList.isEmpty()) {
                return createDefault(mimeTypes, serviceLoader);
            }
            if (arrayList.size() == 1) {
                CT ct = (CT) arrayList.get(0);
                if (isComposite((XmlLoader<CT, T>) ct)) {
                    return ct;
                }
            } else if (!supportsComposite()) {
                throw new TikaConfigException(OooOo.OooOO0O("Composite not supported for ", getParentTagName(), ". Must specify only one child!"));
            }
            return createComposite(arrayList, mimeTypes, serviceLoader);
        }

        public T newInstance(Class<? extends T> cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
            return cls.getDeclaredConstructor(null).newInstance(null);
        }

        public abstract T preLoadOne(Class<? extends T> cls, String str, MimeTypes mimeTypes) throws TikaException;

        public abstract boolean supportsComposite();

        private XmlLoader() {
        }
    }

    static {
        HashMap map = new HashMap();
        strategyMap = map;
        map.put("", InitializableProblemHandler.DEFAULT);
        InitializableProblemHandler initializableProblemHandler = InitializableProblemHandler.IGNORE;
        map.put(initializableProblemHandler.toString(), initializableProblemHandler);
        InitializableProblemHandler initializableProblemHandler2 = InitializableProblemHandler.INFO;
        map.put(initializableProblemHandler2.toString(), initializableProblemHandler2);
        InitializableProblemHandler initializableProblemHandler3 = InitializableProblemHandler.WARN;
        map.put(initializableProblemHandler3.toString(), initializableProblemHandler3);
        InitializableProblemHandler initializableProblemHandler4 = InitializableProblemHandler.THROW;
        map.put(initializableProblemHandler4.toString(), initializableProblemHandler4);
        MAX_JSON_STRING_FIELD_LENGTH = DEFAULT_MAX_JSON_STRING_FIELD_LENGTH;
    }

    public TikaConfig(String str) throws TikaException, SAXException, IOException {
        this(Paths.get(str, new String[0]));
    }

    public static Element getChild(Element element, String str) {
        for (Node firstChild = element.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 1 && str.equals(firstChild.getNodeName())) {
                return (Element) firstChild;
            }
        }
        return null;
    }

    private static InputStream getConfigInputStream(String str, ServiceLoader serviceLoader) throws TikaException, IOException {
        InputStream inputStreamNewInputStream;
        try {
            inputStreamNewInputStream = new URI(str).toURL().openStream();
        } catch (IOException | URISyntaxException unused) {
            inputStreamNewInputStream = null;
        }
        if (inputStreamNewInputStream == null) {
            inputStreamNewInputStream = serviceLoader.getResourceAsStream(str);
        }
        if (inputStreamNewInputStream == null) {
            Path path = Paths.get(str, new String[0]);
            if (Files.isRegularFile(path, new LinkOption[0])) {
                inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
            }
        }
        if (inputStreamNewInputStream != null) {
            return inputStreamNewInputStream;
        }
        throw new TikaException(OooOo.OooOO0("Specified Tika configuration not found: ", str));
    }

    public static TikaConfig getDefaultConfig() {
        try {
            return new TikaConfig();
        } catch (IOException e) {
            throw new RuntimeException("Unable to read default configuration", e);
        } catch (TikaException e2) {
            throw new RuntimeException("Unable to access default configuration", e2);
        }
    }

    public static CompositeDetector getDefaultDetector(MimeTypes mimeTypes, ServiceLoader serviceLoader) {
        return new DefaultDetector(mimeTypes, serviceLoader);
    }

    public static CompositeEncodingDetector getDefaultEncodingDetector(ServiceLoader serviceLoader) {
        return new DefaultEncodingDetector(serviceLoader);
    }

    public static ConfigurableThreadPoolExecutor getDefaultExecutorService() {
        return new SimpleThreadPoolExecutor();
    }

    private static MimeTypes getDefaultMimeTypes(ClassLoader classLoader) {
        return MimeTypes.getDefaultMimeTypes(classLoader);
    }

    public static CompositeParser getDefaultParser(MimeTypes mimeTypes, ServiceLoader serviceLoader, EncodingDetector encodingDetector, Renderer renderer) {
        return new DefaultParser(mimeTypes.getMediaTypeRegistry(), serviceLoader, encodingDetector, renderer);
    }

    public static CompositeRenderer getDefaultRenderer(ServiceLoader serviceLoader) {
        return new CompositeRenderer(serviceLoader);
    }

    public static Translator getDefaultTranslator(ServiceLoader serviceLoader) {
        return new DefaultTranslator(serviceLoader);
    }

    public static InitializableProblemHandler getInitializableProblemHandler(String str) throws TikaConfigException {
        InitializableProblemHandler initializableProblemHandler = strategyMap.get(str.toUpperCase(Locale.US));
        if (initializableProblemHandler != null) {
            return initializableProblemHandler;
        }
        throw new TikaConfigException(OooOo.OooOO0O("Couldn't parse non-null '", str, "'. Must be one of 'ignore', 'info', 'warn' or 'throw'"));
    }

    public static int getMaxJsonStringFieldLength() {
        return MAX_JSON_STRING_FIELD_LENGTH;
    }

    public static String getText(Node node) {
        short nodeType = node.getNodeType();
        if (nodeType != 1) {
            return nodeType != 3 ? "" : node.getNodeValue();
        }
        StringBuilder sb = new StringBuilder();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            sb.append(getText(childNodes.item(i)));
        }
        return sb.toString();
    }

    public static List<Element> getTopLevelElementChildren(Element element, String str, String str2) throws TikaException {
        Node nodeItem = element;
        if (str != null) {
            NodeList elementsByTagName = element.getElementsByTagName(str);
            if (elementsByTagName.getLength() > 1) {
                throw new TikaException(OooOo.OooOO0O("Properties may not contain multiple ", str, " entries"));
            }
            nodeItem = elementsByTagName.getLength() == 1 ? elementsByTagName.item(0) : null;
        }
        if (nodeItem == null) {
            return Collections.EMPTY_LIST;
        }
        NodeList childNodes = nodeItem.getChildNodes();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem2 = childNodes.item(i);
            if (nodeItem2 instanceof Element) {
                Element element2 = (Element) nodeItem2;
                if (str2.equals(element2.getTagName())) {
                    arrayList.add(element2);
                }
            }
        }
        return arrayList;
    }

    public static Set<MediaType> mediaTypesListFromDomElement(Element element, String str) throws TikaException {
        NodeList childNodes = element.getChildNodes();
        HashSet hashSet = null;
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem instanceof Element) {
                Element element2 = (Element) nodeItem;
                if (str.equals(element2.getTagName())) {
                    String text = getText(element2);
                    MediaType mediaType = MediaType.parse(text);
                    if (mediaType == null) {
                        throw new TikaException(OooOo.OooOO0("Invalid media type name: ", text));
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(mediaType);
                } else {
                    continue;
                }
            }
        }
        return hashSet != null ? hashSet : Collections.EMPTY_SET;
    }

    public static void mustNotBeEmpty(String str, String str2) throws TikaConfigException {
        if (StringUtils.isBlank(str2)) {
            throw new IllegalArgumentException(OooOo.OooOO0O("parameter '", str, "' must be set in the config file"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0026 A[PHI: r3
  0x0026: PHI (r3v4 org.apache.tika.config.LoadErrorHandler) = (r3v0 org.apache.tika.config.LoadErrorHandler), (r3v3 org.apache.tika.config.LoadErrorHandler) binds: [B:28:0x0024, B:34:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.apache.tika.config.ServiceLoader serviceLoaderFromDomElement(org.w3c.dom.Element r5, java.lang.ClassLoader r6) throws org.apache.tika.exception.TikaConfigException {
        /*
            java.lang.String r0 = "service-loader"
            org.w3c.dom.Element r5 = getChild(r5, r0)
            if (r5 == 0) goto L56
            java.lang.String r0 = "dynamic"
            java.lang.String r0 = r5.getAttribute(r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            org.apache.tika.config.LoadErrorHandler r1 = org.apache.tika.config.LoadErrorHandler.THROW
            java.lang.String r2 = "loadErrorHandler"
            java.lang.String r2 = r5.getAttribute(r2)
            org.apache.tika.config.LoadErrorHandler r3 = org.apache.tika.config.LoadErrorHandler.WARN
            java.lang.String r4 = r3.toString()
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L28
        L26:
            r1 = r3
            goto L40
        L28:
            java.lang.String r3 = r1.toString()
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L33
            goto L40
        L33:
            org.apache.tika.config.LoadErrorHandler r3 = org.apache.tika.config.LoadErrorHandler.IGNORE
            java.lang.String r4 = r3.toString()
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L40
            goto L26
        L40:
            java.lang.String r2 = "initializableProblemHandler"
            java.lang.String r5 = r5.getAttribute(r2)
            org.apache.tika.config.InitializableProblemHandler r5 = getInitializableProblemHandler(r5)
            if (r6 != 0) goto L50
            java.lang.ClassLoader r6 = org.apache.tika.config.ServiceLoader.getContextClassLoader()
        L50:
            org.apache.tika.config.ServiceLoader r2 = new org.apache.tika.config.ServiceLoader
            r2.<init>(r6, r1, r5, r0)
            return r2
        L56:
            if (r6 == 0) goto L5e
            org.apache.tika.config.ServiceLoader r5 = new org.apache.tika.config.ServiceLoader
            r5.<init>(r6)
            return r5
        L5e:
            org.apache.tika.config.ServiceLoader r5 = new org.apache.tika.config.ServiceLoader
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.config.TikaConfig.serviceLoaderFromDomElement(org.w3c.dom.Element, java.lang.ClassLoader):org.apache.tika.config.ServiceLoader");
    }

    private void setMaxJsonStringFieldLength(Element element) throws TikaConfigException {
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeName().equals(MAX_JSON_STRING_FIELD_LENGTH_ELEMENT_NAME)) {
                try {
                    MAX_JSON_STRING_FIELD_LENGTH = Integer.parseInt(nodeItem.getTextContent());
                    return;
                } catch (NumberFormatException e) {
                    throw new TikaConfigException(OooOo.OooOoo0(MAX_JSON_STRING_FIELD_LENGTH_ELEMENT_NAME, " is not an integer"), e);
                }
            }
        }
    }

    private static MimeTypes typesFromDomElement(Element element) throws TikaException, IOException {
        Element child = getChild(element, "mimeTypeRepository");
        return (child == null || !child.hasAttribute("resource")) ? getDefaultMimeTypes(null) : MimeTypesFactory.create(child.getAttribute("resource"));
    }

    private void updateXMLReaderUtils(Element element) throws TikaException {
        Element child = getChild(element, "xml-reader-utils");
        if (child == null) {
            return;
        }
        if (child.hasAttribute("maxEntityExpansions")) {
            XMLReaderUtils.setMaxEntityExpansions(Integer.parseInt(child.getAttribute("maxEntityExpansions")));
        }
        if (child.hasAttribute("poolSize")) {
            XMLReaderUtils.setPoolSize(Integer.parseInt(child.getAttribute("poolSize")));
        }
    }

    public AutoDetectParserConfig getAutoDetectParserConfig() {
        return this.autoDetectParserConfig;
    }

    public Detector getDetector() {
        return this.detector;
    }

    public EncodingDetector getEncodingDetector() {
        return this.encodingDetector;
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public MediaTypeRegistry getMediaTypeRegistry() {
        return this.mimeTypes.getMediaTypeRegistry();
    }

    public MetadataFilter getMetadataFilter() {
        return this.metadataFilter;
    }

    public MetadataListFilter getMetadataListFilter() {
        return this.metadataListFilter;
    }

    public MimeTypes getMimeRepository() {
        return this.mimeTypes;
    }

    public Parser getParser() {
        return this.parser;
    }

    public ServiceLoader getServiceLoader() {
        return this.serviceLoader;
    }

    public Translator getTranslator() {
        return this.translator;
    }

    public TikaConfig(Path path) throws TikaException, SAXException, IOException {
        this(XMLReaderUtils.buildDOM(path));
    }

    public TikaConfig(Path path, ServiceLoader serviceLoader) throws TikaException, SAXException, IOException {
        this(XMLReaderUtils.buildDOM(path), serviceLoader);
    }

    public TikaConfig(File file) throws TikaException, SAXException, IOException {
        this(XMLReaderUtils.buildDOM(file.toPath()));
    }

    public TikaConfig(File file, ServiceLoader serviceLoader) throws TikaException, SAXException, IOException {
        this(XMLReaderUtils.buildDOM(file.toPath()), serviceLoader);
    }

    public TikaConfig(URL url) throws TikaException, SAXException, IOException {
        this(url, ServiceLoader.getContextClassLoader());
    }

    public TikaConfig(URL url, ClassLoader classLoader) throws TikaException, SAXException, IOException {
        this(XMLReaderUtils.buildDOM(url.toString()).getDocumentElement(), classLoader);
    }

    public TikaConfig(URL url, ServiceLoader serviceLoader) throws TikaException, SAXException, IOException {
        this(XMLReaderUtils.buildDOM(url.toString()).getDocumentElement(), serviceLoader);
    }

    public TikaConfig(InputStream inputStream) throws TikaException, SAXException, IOException {
        this(XMLReaderUtils.buildDOM(inputStream));
    }

    public TikaConfig(Document document) throws TikaException, IOException {
        this(document.getDocumentElement());
    }

    public static void mustNotBeEmpty(String str, Path path) throws TikaConfigException {
        if (path == null) {
            throw new IllegalArgumentException(OooOo.OooOO0O("parameter '", str, "' must be set in the config file"));
        }
    }

    public TikaConfig(Document document, ServiceLoader serviceLoader) throws TikaException, IOException {
        this(document.getDocumentElement(), serviceLoader);
    }

    public TikaConfig(Element element) throws TikaException, IOException {
        this(element, serviceLoaderFromDomElement(element, null));
    }

    public TikaConfig(Element element, ClassLoader classLoader) throws TikaException, IOException {
        this(element, serviceLoaderFromDomElement(element, classLoader));
    }

    private TikaConfig(Element element, ServiceLoader serviceLoader) throws TikaException, IOException {
        DetectorXmlLoader detectorXmlLoader = new DetectorXmlLoader(0);
        TranslatorXmlLoader translatorXmlLoader = new TranslatorXmlLoader(0);
        ExecutorServiceXmlLoader executorServiceXmlLoader = new ExecutorServiceXmlLoader(0);
        EncodingDetectorXmlLoader encodingDetectorXmlLoader = new EncodingDetectorXmlLoader(0);
        RendererXmlLoader rendererXmlLoader = new RendererXmlLoader(0);
        updateXMLReaderUtils(element);
        MimeTypes mimeTypesTypesFromDomElement = typesFromDomElement(element);
        this.mimeTypes = mimeTypesTypesFromDomElement;
        this.detector = detectorXmlLoader.loadOverall(element, mimeTypesTypesFromDomElement, serviceLoader);
        EncodingDetector encodingDetectorLoadOverall = encodingDetectorXmlLoader.loadOverall(element, mimeTypesTypesFromDomElement, serviceLoader);
        this.encodingDetector = encodingDetectorLoadOverall;
        Renderer rendererLoadOverall = rendererXmlLoader.loadOverall(element, mimeTypesTypesFromDomElement, serviceLoader);
        this.renderer = rendererLoadOverall;
        this.parser = new ParserXmlLoader(encodingDetectorLoadOverall, rendererLoadOverall, 0).loadOverall(element, mimeTypesTypesFromDomElement, serviceLoader);
        this.translator = translatorXmlLoader.loadOverall(element, mimeTypesTypesFromDomElement, serviceLoader);
        this.executorService = executorServiceXmlLoader.loadOverall(element, mimeTypesTypesFromDomElement, serviceLoader);
        this.metadataFilter = MetadataFilter.load(element, true);
        this.metadataListFilter = MetadataListFilter.load(element, true);
        this.autoDetectParserConfig = AutoDetectParserConfig.load(element);
        this.serviceLoader = serviceLoader;
        setMaxJsonStringFieldLength(element);
        TIMES_INSTANTIATED.incrementAndGet();
    }

    public TikaConfig(ClassLoader classLoader) throws IOException, MimeTypeException {
        ServiceLoader serviceLoader = new ServiceLoader(classLoader);
        this.serviceLoader = serviceLoader;
        MimeTypes defaultMimeTypes = getDefaultMimeTypes(classLoader);
        this.mimeTypes = defaultMimeTypes;
        this.detector = getDefaultDetector(defaultMimeTypes, serviceLoader);
        CompositeEncodingDetector defaultEncodingDetector = getDefaultEncodingDetector(serviceLoader);
        this.encodingDetector = defaultEncodingDetector;
        CompositeRenderer defaultRenderer = getDefaultRenderer(serviceLoader);
        this.renderer = defaultRenderer;
        this.parser = getDefaultParser(defaultMimeTypes, serviceLoader, defaultEncodingDetector, defaultRenderer);
        this.translator = getDefaultTranslator(serviceLoader);
        this.executorService = getDefaultExecutorService();
        this.metadataFilter = new NoOpFilter();
        this.metadataListFilter = new NoOpListFilter();
        this.autoDetectParserConfig = AutoDetectParserConfig.DEFAULT;
        TIMES_INSTANTIATED.incrementAndGet();
    }

    public TikaConfig() throws TikaException, IOException {
        String property = System.getProperty("tika.config");
        if (!StringUtils.isBlank(property)) {
            LOG.OooOOo0("loading tika config from system property 'tika.config'");
        }
        if (StringUtils.isBlank(property)) {
            property = System.getenv("TIKA_CONFIG");
            if (!StringUtils.isBlank(property)) {
                LOG.OooOOo0("loading tika config from environment variable 'TIKA_CONFIG'");
            }
        }
        if (StringUtils.isBlank(property)) {
            LOG.OooOOo0("loading tika config from defaults; no config file specified");
            ServiceLoader serviceLoader = new ServiceLoader();
            this.serviceLoader = serviceLoader;
            MimeTypes defaultMimeTypes = getDefaultMimeTypes(ServiceLoader.getContextClassLoader());
            this.mimeTypes = defaultMimeTypes;
            CompositeEncodingDetector defaultEncodingDetector = getDefaultEncodingDetector(serviceLoader);
            this.encodingDetector = defaultEncodingDetector;
            CompositeRenderer defaultRenderer = getDefaultRenderer(serviceLoader);
            this.renderer = defaultRenderer;
            this.parser = getDefaultParser(defaultMimeTypes, serviceLoader, defaultEncodingDetector, defaultRenderer);
            this.detector = getDefaultDetector(defaultMimeTypes, serviceLoader);
            this.translator = getDefaultTranslator(serviceLoader);
            this.executorService = getDefaultExecutorService();
            this.metadataFilter = new NoOpFilter();
            this.metadataListFilter = new NoOpListFilter();
            this.autoDetectParserConfig = AutoDetectParserConfig.DEFAULT;
        } else {
            ServiceLoader serviceLoader2 = new ServiceLoader();
            LOG.OooOOo0("loading tika config from: " + property);
            try {
                InputStream configInputStream = getConfigInputStream(property, serviceLoader2);
                try {
                    Element documentElement = XMLReaderUtils.buildDOM(configInputStream).getDocumentElement();
                    updateXMLReaderUtils(documentElement);
                    ServiceLoader serviceLoaderServiceLoaderFromDomElement = serviceLoaderFromDomElement(documentElement, serviceLoader2.getLoader());
                    this.serviceLoader = serviceLoaderServiceLoaderFromDomElement;
                    DetectorXmlLoader detectorXmlLoader = new DetectorXmlLoader(0);
                    EncodingDetectorXmlLoader encodingDetectorXmlLoader = new EncodingDetectorXmlLoader(0);
                    RendererXmlLoader rendererXmlLoader = new RendererXmlLoader(0);
                    TranslatorXmlLoader translatorXmlLoader = new TranslatorXmlLoader(0);
                    ExecutorServiceXmlLoader executorServiceXmlLoader = new ExecutorServiceXmlLoader(0);
                    MimeTypes mimeTypesTypesFromDomElement = typesFromDomElement(documentElement);
                    this.mimeTypes = mimeTypesTypesFromDomElement;
                    EncodingDetector encodingDetectorLoadOverall = encodingDetectorXmlLoader.loadOverall(documentElement, mimeTypesTypesFromDomElement, serviceLoaderServiceLoaderFromDomElement);
                    this.encodingDetector = encodingDetectorLoadOverall;
                    Renderer rendererLoadOverall = rendererXmlLoader.loadOverall(documentElement, mimeTypesTypesFromDomElement, serviceLoaderServiceLoaderFromDomElement);
                    this.renderer = rendererLoadOverall;
                    this.parser = new ParserXmlLoader(encodingDetectorLoadOverall, rendererLoadOverall, 0).loadOverall(documentElement, mimeTypesTypesFromDomElement, serviceLoaderServiceLoaderFromDomElement);
                    this.detector = detectorXmlLoader.loadOverall(documentElement, mimeTypesTypesFromDomElement, serviceLoaderServiceLoaderFromDomElement);
                    this.translator = translatorXmlLoader.loadOverall(documentElement, mimeTypesTypesFromDomElement, serviceLoaderServiceLoaderFromDomElement);
                    this.executorService = executorServiceXmlLoader.loadOverall(documentElement, mimeTypesTypesFromDomElement, serviceLoaderServiceLoaderFromDomElement);
                    this.metadataFilter = MetadataFilter.load(documentElement, true);
                    this.metadataListFilter = MetadataListFilter.load(documentElement, true);
                    this.autoDetectParserConfig = AutoDetectParserConfig.load(documentElement);
                    setMaxJsonStringFieldLength(documentElement);
                    if (configInputStream != null) {
                        configInputStream.close();
                    }
                } finally {
                }
            } catch (SAXException e) {
                throw new TikaException(OooOo.OooOO0("Specified Tika configuration has syntax errors: ", property), e);
            }
        }
        TIMES_INSTANTIATED.incrementAndGet();
    }
}
