package org.apache.tika.embedder;

import OooO0oO.OooOo;
import com.ironsource.C3034d9;
import io.flutter.plugins.webviewflutter.OooOOOO;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o00OOooO.o00O00;
import o00Oo00.OooO;
import o00Oo00o.o0OoOo0;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.mime.MediaType;
import org.apache.tika.p015io.TemporaryResources;
import org.apache.tika.p015io.TikaInputStream;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.external.ExternalParser;

/* loaded from: classes3.dex */
public class ExternalEmbedder implements Embedder {
    public static final String METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN = "${METADATA_SERIALIZED}";
    public static final String METADATA_COMMAND_ARGUMENTS_TOKEN = "${METADATA}";
    private static final long serialVersionUID = -2828829275642475697L;
    private final TemporaryResources tmp = new TemporaryResources();
    private Set<MediaType> supportedEmbedTypes = Collections.EMPTY_SET;
    private Map<Property, String[]> metadataCommandArguments = null;
    private String[] command = {"sed", "-e", "$a\\\n${METADATA_SERIALIZED}", ExternalParser.INPUT_FILE_TOKEN};
    private String commandAssignmentOperator = C3034d9.i.f8173b;
    private String commandAssignmentDelimeter = ", ";
    private String commandAppendOperator = C3034d9.i.f8173b;
    private boolean quoteAssignmentValues = false;

    public static boolean check(String str, int... iArr) {
        return check(new String[]{str}, iArr);
    }

    public static /* synthetic */ void lambda$multiThreadedStreamCopy$0(InputStream inputStream, OutputStream outputStream) {
        try {
            o00O00.OooO0O0(inputStream, outputStream);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void multiThreadedStreamCopy(InputStream inputStream, OutputStream outputStream) {
        new Thread(new OooOOOO(16, inputStream, outputStream)).start();
    }

    private void sendInputStreamToStdIn(InputStream inputStream, Process process) {
        multiThreadedStreamCopy(inputStream, process.getOutputStream());
    }

    private void sendStdErrToOutputStream(Process process, OutputStream outputStream) {
        multiThreadedStreamCopy(process.getErrorStream(), outputStream);
    }

    private void sendStdOutToOutputStream(Process process, OutputStream outputStream) {
        try {
            o00O00.OooO0O0(process.getInputStream(), outputStream);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static String serializeMetadata(List<String> list) {
        return list != null ? Arrays.toString(list.toArray()) : "";
    }

    @Override // org.apache.tika.embedder.Embedder
    public void embed(Metadata metadata, InputStream inputStream, OutputStream outputStream, ParseContext parseContext) throws TikaException, InterruptedException, IOException {
        TikaInputStream tikaInputStream;
        Map<Property, String[]> map = this.metadataCommandArguments;
        boolean z = (map == null || map.isEmpty()) ? false : true;
        TikaInputStream tikaInputStream2 = TikaInputStream.get(inputStream);
        File file = null;
        List<String> commandMetadataSegments = z ? getCommandMetadataSegments(metadata) : null;
        String[] strArr = this.command;
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        boolean z5 = true;
        while (i < length) {
            String strReplace = strArr[i];
            boolean z6 = z;
            if (strReplace.contains(ExternalParser.INPUT_FILE_TOKEN)) {
                tikaInputStream = tikaInputStream2;
                strReplace = strReplace.replace(ExternalParser.INPUT_FILE_TOKEN, tikaInputStream2.getFile().toString());
                z4 = false;
            } else {
                tikaInputStream = tikaInputStream2;
            }
            if (strReplace.contains(ExternalParser.OUTPUT_FILE_TOKEN)) {
                File fileCreateTemporaryFile = this.tmp.createTemporaryFile();
                strReplace = strReplace.replace(ExternalParser.OUTPUT_FILE_TOKEN, fileCreateTemporaryFile.toString());
                file = fileCreateTemporaryFile;
                z5 = false;
            }
            if (strReplace.contains(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN)) {
                z2 = true;
            }
            if (strReplace.contains(METADATA_COMMAND_ARGUMENTS_TOKEN)) {
                if (z6) {
                    arrayList.addAll(commandMetadataSegments);
                }
                z3 = true;
            } else {
                arrayList.add(strReplace);
            }
            i++;
            z = z6;
            tikaInputStream2 = tikaInputStream;
        }
        TikaInputStream tikaInputStream3 = tikaInputStream2;
        if (z) {
            if (z2) {
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    String str = (String) obj;
                    if (str.contains(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN)) {
                        arrayList.set(i2, str.replace(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN, serializeMetadata(commandMetadataSegments)));
                    }
                    i2++;
                }
            } else if (!z3 && !z2) {
                arrayList.addAll(commandMetadataSegments);
            }
        }
        Process processExec = arrayList.toArray().length == 1 ? Runtime.getRuntime().exec(((String[]) arrayList.toArray(new String[0]))[0]) : Runtime.getRuntime().exec((String[]) arrayList.toArray(new String[0]));
        int i4 = o0OoOo0.f32678OooOoOO;
        new OooO();
        o0OoOo0 o0oooo0 = new o0OoOo0();
        try {
            sendStdErrToOutputStream(processExec, o0oooo0);
            if (z4) {
                sendInputStreamToStdIn(inputStream, processExec);
            } else {
                processExec.getOutputStream().close();
            }
            if (z5) {
                sendStdOutToOutputStream(processExec, outputStream);
            } else {
                this.tmp.dispose();
                try {
                    processExec.waitFor();
                } catch (InterruptedException unused) {
                }
                o00O00.OooO0O0(TikaInputStream.get(file), outputStream);
            }
            if (z5) {
                try {
                    processExec.waitFor();
                } catch (InterruptedException | Exception unused2) {
                }
            } else {
                file.delete();
            }
            if (!z4) {
                o00O00.OooO00o(tikaInputStream3);
            }
            o00O00.OooO00o(outputStream);
            o00O00.OooO00o(o0oooo0);
            if (processExec.exitValue() == 0) {
                return;
            }
            throw new TikaException("There was an error executing the command line\nExecutable Command:\n\n" + arrayList + "\nExecutable Error:\n\n" + new String(o0oooo0.OooO0O0(), StandardCharsets.UTF_8.name()));
        } catch (Throwable th) {
            if (z5) {
                try {
                    processExec.waitFor();
                } catch (InterruptedException | Exception unused3) {
                }
            } else {
                file.delete();
            }
            if (!z4) {
                o00O00.OooO00o(tikaInputStream3);
            }
            o00O00.OooO00o(outputStream);
            o00O00.OooO00o(o0oooo0);
            if (processExec.exitValue() == 0) {
                throw th;
            }
            throw new TikaException("There was an error executing the command line\nExecutable Command:\n\n" + arrayList + "\nExecutable Error:\n\n" + new String(o0oooo0.OooO0O0(), StandardCharsets.UTF_8.name()));
        }
    }

    public String[] getCommand() {
        return this.command;
    }

    public String getCommandAppendOperator() {
        return this.commandAppendOperator;
    }

    public String getCommandAssignmentDelimeter() {
        return this.commandAssignmentDelimeter;
    }

    public String getCommandAssignmentOperator() {
        return this.commandAssignmentOperator;
    }

    public List<String> getCommandMetadataSegments(Metadata metadata) {
        String[] strArr;
        String[] strArr2;
        int i;
        ArrayList arrayList = new ArrayList();
        if (metadata != null && metadata.names() != null) {
            String[] strArrNames = metadata.names();
            int length = strArrNames.length;
            for (int i2 = 0; i2 < length; i2++) {
                String str = strArrNames[i2];
                for (Property property : getMetadataCommandArguments().keySet()) {
                    if (str.equals(property.getName()) && (strArr = getMetadataCommandArguments().get(property)) != null) {
                        int length2 = strArr.length;
                        int i3 = 0;
                        while (i3 < length2) {
                            String str2 = strArr[i3];
                            if (metadata.isMultiValued(str)) {
                                String[] values = metadata.getValues(str);
                                int length3 = values.length;
                                int i4 = 0;
                                while (true) {
                                    strArr2 = strArrNames;
                                    if (i4 >= length3) {
                                        break;
                                    }
                                    String strOooOO0O = values[i4];
                                    int i5 = length;
                                    if (this.quoteAssignmentValues) {
                                        strOooOO0O = OooOo.OooOO0O("'", strOooOO0O, "'");
                                    }
                                    arrayList.add(str2 + this.commandAppendOperator + strOooOO0O);
                                    i4++;
                                    strArrNames = strArr2;
                                    length = i5;
                                }
                                i = length;
                            } else {
                                strArr2 = strArrNames;
                                i = length;
                                String strOooOO0O2 = metadata.get(str);
                                if (this.quoteAssignmentValues) {
                                    strOooOO0O2 = OooOo.OooOO0O("'", strOooOO0O2, "'");
                                }
                                arrayList.add(str2 + this.commandAssignmentOperator + strOooOO0O2);
                            }
                            i3++;
                            strArrNames = strArr2;
                            length = i;
                        }
                    }
                    strArrNames = strArrNames;
                    length = length;
                }
            }
        }
        return arrayList;
    }

    public Map<Property, String[]> getMetadataCommandArguments() {
        return this.metadataCommandArguments;
    }

    @Override // org.apache.tika.embedder.Embedder
    public Set<MediaType> getSupportedEmbedTypes(ParseContext parseContext) {
        return getSupportedEmbedTypes();
    }

    public boolean isQuoteAssignmentValues() {
        return this.quoteAssignmentValues;
    }

    public void setCommand(String... strArr) {
        this.command = strArr;
    }

    public void setCommandAppendOperator(String str) {
        this.commandAppendOperator = str;
    }

    public void setCommandAssignmentDelimeter(String str) {
        this.commandAssignmentDelimeter = str;
    }

    public void setCommandAssignmentOperator(String str) {
        this.commandAssignmentOperator = str;
    }

    public void setMetadataCommandArguments(Map<Property, String[]> map) {
        this.metadataCommandArguments = map;
    }

    public void setQuoteAssignmentValues(boolean z) {
        this.quoteAssignmentValues = z;
    }

    public void setSupportedEmbedTypes(Set<MediaType> set) {
        this.supportedEmbedTypes = Collections.unmodifiableSet(new HashSet(set));
    }

    public static boolean check(String[] strArr, int... iArr) throws InterruptedException {
        if (iArr.length == 0) {
            iArr = new int[]{127};
        }
        try {
            int iWaitFor = (strArr.length == 1 ? Runtime.getRuntime().exec(strArr[0]) : Runtime.getRuntime().exec(strArr)).waitFor();
            for (int i : iArr) {
                if (iWaitFor == i) {
                    return false;
                }
            }
            return true;
        } catch (IOException | InterruptedException unused) {
            return false;
        }
    }

    public Set<MediaType> getSupportedEmbedTypes() {
        return this.supportedEmbedTypes;
    }
}
