package org.apache.tika.extractor;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.p015io.FilenameUtils;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes3.dex */
public abstract class AbstractEmbeddedDocumentBytesHandler implements EmbeddedDocumentBytesHandler {
    List<Integer> ids = new ArrayList();

    @Override // org.apache.tika.extractor.EmbeddedDocumentBytesHandler
    public void add(int i, Metadata metadata, InputStream inputStream) throws IOException {
        this.ids.add(Integer.valueOf(i));
    }

    public String getEmitKey(String str, int i, EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig, Metadata metadata) {
        String strLeftPad = embeddedDocumentBytesConfig.getZeroPadName() > 0 ? StringUtils.leftPad(Integer.toString(i), embeddedDocumentBytesConfig.getZeroPadName(), "0") : Integer.toString(i);
        StringBuilder sb = new StringBuilder();
        if (StringUtils.isBlank(embeddedDocumentBytesConfig.getEmitKeyBase())) {
            sb.append(str);
            sb.append("/");
            sb.append(FilenameUtils.getName(str));
        } else {
            sb.append(embeddedDocumentBytesConfig.getEmitKeyBase());
        }
        sb.append(embeddedDocumentBytesConfig.getEmbeddedIdPrefix());
        sb.append(strLeftPad);
        if (embeddedDocumentBytesConfig.getSuffixStrategy().equals(EmbeddedDocumentBytesConfig.SUFFIX_STRATEGY.EXISTING)) {
            sb.append(FilenameUtils.getSuffixFromPath(metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY)).toLowerCase(Locale.US));
        }
        return sb.toString();
    }

    @Override // org.apache.tika.extractor.EmbeddedDocumentBytesHandler
    public List<Integer> getIds() {
        return this.ids;
    }
}
