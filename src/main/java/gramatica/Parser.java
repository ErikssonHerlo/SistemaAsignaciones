
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package gramatica;

import java_cup.runtime.Symbol;
import objetos.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\014\000\002\002\004\000\002\002\004\000\002\002" +
    "\002\000\002\003\013\000\002\003\015\000\002\003\013" +
    "\000\002\003\007\000\002\003\013\000\002\003\015\000" +
    "\002\003\023\000\002\003\015\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\130\000\026\002\uffff\003\013\004\011\012\005\016" +
    "\012\017\010\020\006\021\007\022\004\023\014\001\002" +
    "\000\004\005\113\001\002\000\004\005\101\001\002\000" +
    "\004\005\071\001\002\000\004\005\057\001\002\000\004" +
    "\005\053\001\002\000\004\005\043\001\002\000\004\005" +
    "\033\001\002\000\026\002\ufff6\003\ufff6\004\ufff6\012\ufff6" +
    "\016\ufff6\017\ufff6\020\ufff6\021\ufff6\022\ufff6\023\ufff6\001" +
    "\002\000\004\005\021\001\002\000\026\002\uffff\003\013" +
    "\004\011\012\005\016\012\017\010\020\006\021\007\022" +
    "\004\023\014\001\002\000\004\002\017\001\002\000\004" +
    "\002\001\001\002\000\004\002\000\001\002\000\004\007" +
    "\022\001\002\000\004\015\023\001\002\000\004\007\024" +
    "\001\002\000\004\015\025\001\002\000\004\007\026\001" +
    "\002\000\004\015\027\001\002\000\004\007\030\001\002" +
    "\000\004\006\031\001\002\000\004\011\032\001\002\000" +
    "\026\002\ufff7\003\ufff7\004\ufff7\012\ufff7\016\ufff7\017\ufff7" +
    "\020\ufff7\021\ufff7\022\ufff7\023\ufff7\001\002\000\004\007" +
    "\034\001\002\000\004\015\035\001\002\000\004\013\036" +
    "\001\002\000\004\015\037\001\002\000\004\013\040\001" +
    "\002\000\004\006\041\001\002\000\004\011\042\001\002" +
    "\000\026\002\ufffc\003\ufffc\004\ufffc\012\ufffc\016\ufffc\017" +
    "\ufffc\020\ufffc\021\ufffc\022\ufffc\023\ufffc\001\002\000\004" +
    "\007\044\001\002\000\004\015\045\001\002\000\004\013" +
    "\046\001\002\000\004\015\047\001\002\000\004\013\050" +
    "\001\002\000\004\006\051\001\002\000\004\011\052\001" +
    "\002\000\026\002\ufffe\003\ufffe\004\ufffe\012\ufffe\016\ufffe" +
    "\017\ufffe\020\ufffe\021\ufffe\022\ufffe\023\ufffe\001\002\000" +
    "\004\013\054\001\002\000\004\006\055\001\002\000\004" +
    "\011\056\001\002\000\026\002\ufffb\003\ufffb\004\ufffb\012" +
    "\ufffb\016\ufffb\017\ufffb\020\ufffb\021\ufffb\022\ufffb\023\ufffb" +
    "\001\002\000\004\007\060\001\002\000\004\015\061\001" +
    "\002\000\004\013\062\001\002\000\004\015\063\001\002" +
    "\000\004\007\064\001\002\000\004\015\065\001\002\000" +
    "\004\007\066\001\002\000\004\006\067\001\002\000\004" +
    "\011\070\001\002\000\026\002\ufff9\003\ufff9\004\ufff9\012" +
    "\ufff9\016\ufff9\017\ufff9\020\ufff9\021\ufff9\022\ufff9\023\ufff9" +
    "\001\002\000\004\013\072\001\002\000\004\015\073\001" +
    "\002\000\004\007\074\001\002\000\004\015\075\001\002" +
    "\000\004\007\076\001\002\000\004\006\077\001\002\000" +
    "\004\011\100\001\002\000\026\002\ufffa\003\ufffa\004\ufffa" +
    "\012\ufffa\016\ufffa\017\ufffa\020\ufffa\021\ufffa\022\ufffa\023" +
    "\ufffa\001\002\000\004\007\102\001\002\000\004\015\103" +
    "\001\002\000\004\013\104\001\002\000\004\015\105\001" +
    "\002\000\004\013\106\001\002\000\004\015\107\001\002" +
    "\000\004\014\110\001\002\000\004\006\111\001\002\000" +
    "\004\011\112\001\002\000\026\002\ufffd\003\ufffd\004\ufffd" +
    "\012\ufffd\016\ufffd\017\ufffd\020\ufffd\021\ufffd\022\ufffd\023" +
    "\ufffd\001\002\000\004\007\114\001\002\000\004\015\115" +
    "\001\002\000\004\013\116\001\002\000\004\015\117\001" +
    "\002\000\004\013\120\001\002\000\004\015\121\001\002" +
    "\000\004\007\122\001\002\000\004\015\123\001\002\000" +
    "\004\007\124\001\002\000\004\015\125\001\002\000\004" +
    "\014\126\001\002\000\004\015\127\001\002\000\004\007" +
    "\130\001\002\000\004\006\131\001\002\000\004\011\132" +
    "\001\002\000\026\002\ufff8\003\ufff8\004\ufff8\012\ufff8\016" +
    "\ufff8\017\ufff8\020\ufff8\021\ufff8\022\ufff8\023\ufff8\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\130\000\006\002\015\003\014\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\002\017\003\014" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private ArrayList<Catedratico> listaCatedraticos = new ArrayList<>();
    private ArrayList<Edificio> listaEdificios = new ArrayList<>();
    private ArrayList<Salon> listaSalones = new ArrayList<>();
    private ArrayList<Curso> listaCursos = new ArrayList<>();
    private ArrayList<Horario> listaHorarios = new ArrayList<>();
    private ArrayList<Asignacion> listaAsignaciones = new ArrayList<>();
    public Parser(Lexer lex){
        super(lex);
    }
 
    @Override
    public void syntax_error(Symbol st) {
        Token error = (Token) st.value;
        report_error("Error Sintactico con el Token:"+ error.getLexeme()+" este no pertenece a la estructura  >linea: "+error.getLine()+" >columna: "+error.getColumn() + "\n",null);
    }

    public ArrayList<Estudiante> getListaEstudiantes(){
        return listaEstudiantes;
    }

    public ArrayList<Usuario> getListaUsuarios(){
        return listaUsuarios;
    }

    public ArrayList<Catedratico> getListaCatedraticos(){
        return listaCatedraticos;
    }
    
    public ArrayList<Edificio> getListaEdificios(){
        return listaEdificios;
    }

    public ArrayList<Salon> getListaSalones(){
        return listaSalones;
    }

    public ArrayList<Curso> getListaCursos(){
        return listaCursos;
    }

    public ArrayList<Horario> getListaHorarios(){
        return listaHorarios;
    }

    public ArrayList<Asignacion> getListaAsignaciones(){
        return listaAsignaciones;
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= s0 EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // s0 ::= s1 s0 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("s0",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // s0 ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("s0",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // s1 ::= ESTUDIANTE PARENTESIS_A NUMERO COMA STRING_S COMA STRING_S PARENTESIS_C PUNTOCOMA 
            {
              Object RESULT =null;
		int carnetleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int carnetright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Token carnet = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int nombreleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int nombreright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Token nombre = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int direccionleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int direccionright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token direccion = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		
        String nombreFinal = nombre.getLexeme().replace("\"", "");
        String direccionFinal = direccion.getLexeme().replace("\"", "");
        System.out.println(carnet.getLexeme()+" + "+nombreFinal+" + "+direccionFinal);
        listaEstudiantes.add(new Estudiante(Integer.parseInt(carnet.getLexeme()),nombreFinal,direccionFinal));
    
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("s1",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // s1 ::= USUARIO PARENTESIS_A NUMERO COMA STRING_S COMA STRING_S COMA ID PARENTESIS_C PUNTOCOMA 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Token id = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int nombreleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int nombreright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Token nombre = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int passwordleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int passwordright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Token password = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int tipoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int tiporight = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token tipo = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		
        int idFinal = Integer.parseInt(id.getLexeme());
        String nombreFinal = nombre.getLexeme().replace("\"", "");
        String passwordFinal = password.getLexeme().replace("\"", "");
        String tipoFinal = tipo.getLexeme();
        listaUsuarios.add(new Usuario(idFinal,nombreFinal,passwordFinal,tipoFinal));
    
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("s1",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // s1 ::= CATEDRATICO PARENTESIS_A NUMERO COMA STRING_S COMA STRING_S PARENTESIS_C PUNTOCOMA 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Token id = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int nombreleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int nombreright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Token nombre = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int direccionleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int direccionright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token direccion = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		
        int idFinal = Integer.parseInt(id.getLexeme());
        String nombreFinal = nombre.getLexeme().replace("\"", "");
        String direccionFinal = direccion.getLexeme().replace("\"", "");
        listaCatedraticos.add(new Catedratico(idFinal,nombreFinal,direccionFinal));
    
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("s1",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // s1 ::= EDIFICIO PARENTESIS_A STRING_S PARENTESIS_C PUNTOCOMA 
            {
              Object RESULT =null;
		int nombreleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int nombreright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token nombre = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		
        String nombreFinal = nombre.getLexeme().replace("\"", "");
        listaEdificios.add(new Edificio(nombreFinal));
    
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("s1",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // s1 ::= SALON PARENTESIS_A STRING_S COMA NUMERO COMA NUMERO PARENTESIS_C PUNTOCOMA 
            {
              Object RESULT =null;
		int edificioleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int edificioright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Token edificio = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int numeroleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int numeroright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Token numero = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int capacidadleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int capacidadright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token capacidad = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		
        int numeroFinal = Integer.parseInt(numero.getLexeme());
        int capacidadFinal = Integer.parseInt(capacidad.getLexeme());
        String edificioFinal = edificio.getLexeme().replace("\"", "");
        listaSalones.add(new Salon(numeroFinal,capacidadFinal,edificioFinal));
    
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("s1",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // s1 ::= CURSO PARENTESIS_A NUMERO COMA STRING_S COMA NUMERO COMA NUMERO PARENTESIS_C PUNTOCOMA 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Token id = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int nombreleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int nombreright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Token nombre = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int semestreleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int semestreright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Token semestre = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int creditosleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int creditosright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token creditos = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		
        int idFinal = Integer.parseInt(id.getLexeme());
        String nombreFinal = nombre.getLexeme().replace("\"", "");
        int semestreFinal = Integer.parseInt(semestre.getLexeme());
        int creditosFinal = Integer.parseInt(creditos.getLexeme());

        listaCursos.add(new Curso(idFinal,nombreFinal,semestreFinal,creditosFinal));
    
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("s1",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // s1 ::= HORARIO PARENTESIS_A NUMERO COMA STRING_S COMA STRING_S COMA NUMERO COMA NUMERO COMA ID COMA NUMERO PARENTESIS_C PUNTOCOMA 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-14)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-14)).right;
		Token id = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-14)).value;
		int periodoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-12)).left;
		int periodoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-12)).right;
		Token periodo = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-12)).value;
		int dialeft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).left;
		int diaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).right;
		Token dia = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-10)).value;
		int cursoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int cursoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Token curso = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int salonleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int salonright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Token salon = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int edificioleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int edificioright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Token edificio = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int catedraticoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int catedraticoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token catedratico = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		
        int idFinal = Integer.parseInt(id.getLexeme());
        String periodoFinal = periodo.getLexeme().replace("\"", "");
        String diaFinal = dia.getLexeme().replace("\"", "");
        int cursoFinal = Integer.parseInt(curso.getLexeme());
        int salonFinal = Integer.parseInt(salon.getLexeme());
        String edificioFinal = edificio.getLexeme();
        int catedraticoFinal = Integer.parseInt(catedratico.getLexeme());

        listaHorarios.add(new Horario(idFinal,periodoFinal,diaFinal,cursoFinal,salonFinal,edificioFinal,catedraticoFinal));
    
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("s1",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-16)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // s1 ::= ASIGNAR PARENTESIS_A NUMERO COMA NUMERO COMA NUMERO COMA NUMERO PARENTESIS_C PUNTOCOMA 
            {
              Object RESULT =null;
		int carnetleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int carnetright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Token carnet = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int horarioleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int horarioright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Token horario = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int zonaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int zonaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Token zona = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int examenleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int examenright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token examen = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		
        int carnetFinal = Integer.parseInt(carnet.getLexeme());
        int horarioFinal = Integer.parseInt(horario.getLexeme());
        int zonaFinal = Integer.parseInt(zona.getLexeme());
        int examenFinal = Integer.parseInt(examen.getLexeme());

        listaAsignaciones.add(new Asignacion(zonaFinal,examenFinal,carnetFinal,horarioFinal));
    
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("s1",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // s1 ::= error 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("s1",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
