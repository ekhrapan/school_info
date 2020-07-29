package academy.belhard.writer;

import academy.belhard.dto.FullINfoDto;
import academy.belhard.util.FullInfoUtil;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class FullInfoWriter {

    private String filepath;

    public FullInfoWriter(String filepath) {
        this.filepath = filepath;
    }

    public void writeAll(List<FullINfoDto> dtos) throws IOException {
        try (Writer writer = new FileWriter(filepath)) {
//            writer.write(PersonCsvUtil.headers());

            for (FullINfoDto dto : dtos) {
                writer.write(FullInfoUtil.toCsvString(dto));
            }
        }
    }
}
