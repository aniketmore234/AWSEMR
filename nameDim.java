// ORM class for table 'nameDim'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu May 31 12:34:17 UTC 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class nameDim extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer name_id;
  public Integer get_name_id() {
    return name_id;
  }
  public void set_name_id(Integer name_id) {
    this.name_id = name_id;
  }
  public nameDim with_name_id(Integer name_id) {
    this.name_id = name_id;
    return this;
  }
  private Integer Company_ID;
  public Integer get_Company_ID() {
    return Company_ID;
  }
  public void set_Company_ID(Integer Company_ID) {
    this.Company_ID = Company_ID;
  }
  public nameDim with_Company_ID(Integer Company_ID) {
    this.Company_ID = Company_ID;
    return this;
  }
  private String Symbol;
  public String get_Symbol() {
    return Symbol;
  }
  public void set_Symbol(String Symbol) {
    this.Symbol = Symbol;
  }
  public nameDim with_Symbol(String Symbol) {
    this.Symbol = Symbol;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof nameDim)) {
      return false;
    }
    nameDim that = (nameDim) o;
    boolean equal = true;
    equal = equal && (this.name_id == null ? that.name_id == null : this.name_id.equals(that.name_id));
    equal = equal && (this.Company_ID == null ? that.Company_ID == null : this.Company_ID.equals(that.Company_ID));
    equal = equal && (this.Symbol == null ? that.Symbol == null : this.Symbol.equals(that.Symbol));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof nameDim)) {
      return false;
    }
    nameDim that = (nameDim) o;
    boolean equal = true;
    equal = equal && (this.name_id == null ? that.name_id == null : this.name_id.equals(that.name_id));
    equal = equal && (this.Company_ID == null ? that.Company_ID == null : this.Company_ID.equals(that.Company_ID));
    equal = equal && (this.Symbol == null ? that.Symbol == null : this.Symbol.equals(that.Symbol));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.name_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.Company_ID = JdbcWritableBridge.readInteger(2, __dbResults);
    this.Symbol = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.name_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.Company_ID = JdbcWritableBridge.readInteger(2, __dbResults);
    this.Symbol = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(name_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Company_ID, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Symbol, 3 + __off, 12, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(name_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Company_ID, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Symbol, 3 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.name_id = null;
    } else {
    this.name_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Company_ID = null;
    } else {
    this.Company_ID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Symbol = null;
    } else {
    this.Symbol = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.name_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.name_id);
    }
    if (null == this.Company_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Company_ID);
    }
    if (null == this.Symbol) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Symbol);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.name_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.name_id);
    }
    if (null == this.Company_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Company_ID);
    }
    if (null == this.Symbol) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Symbol);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(name_id==null?"null":"" + name_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Company_ID==null?"null":"" + Company_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Symbol==null?"null":Symbol, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(name_id==null?"null":"" + name_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Company_ID==null?"null":"" + Company_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Symbol==null?"null":Symbol, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.name_id = null; } else {
      this.name_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Company_ID = null; } else {
      this.Company_ID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Symbol = null; } else {
      this.Symbol = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.name_id = null; } else {
      this.name_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Company_ID = null; } else {
      this.Company_ID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Symbol = null; } else {
      this.Symbol = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    nameDim o = (nameDim) super.clone();
    return o;
  }

  public void clone0(nameDim o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("name_id", this.name_id);
    __sqoop$field_map.put("Company_ID", this.Company_ID);
    __sqoop$field_map.put("Symbol", this.Symbol);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("name_id", this.name_id);
    __sqoop$field_map.put("Company_ID", this.Company_ID);
    __sqoop$field_map.put("Symbol", this.Symbol);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("name_id".equals(__fieldName)) {
      this.name_id = (Integer) __fieldVal;
    }
    else    if ("Company_ID".equals(__fieldName)) {
      this.Company_ID = (Integer) __fieldVal;
    }
    else    if ("Symbol".equals(__fieldName)) {
      this.Symbol = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("name_id".equals(__fieldName)) {
      this.name_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("Company_ID".equals(__fieldName)) {
      this.Company_ID = (Integer) __fieldVal;
      return true;
    }
    else    if ("Symbol".equals(__fieldName)) {
      this.Symbol = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
