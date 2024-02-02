ejemplo01

	Clase simple con nombres iguales a la tabla
	@Entity
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		GenerationType.IDENTITY -> Autoincremental
		GenerationType.SEQUENCE -> Se genera con una secuencia
		GenerationType.TABLE -> El motor lo gestiona en una tabla en la BBDD
		GenerationType.AUTO -> Lo debe resolver el motor. 
			Hibernate lo resuelve igual que TABLE
	
ejemplo02

	Clase simple que no coinciden los nombres
	@Table(name = "nombre_tabla")
	@Column(name = "nombre_columna_tabla")
	Incorpora un enum
	@Enumerated(EnumType.STRING) -> Almacena una cadena con el nombre de la constante
	@Enumerated(EnumType.ORDINAL) -> Alamacena el ordinal (comportamiento por defecto)
	
ejemplo03

	Utilizamos un insertable.
	Clases con una relacion uno a uno. Una sóla tabla
	@Embeddable
	@Embedded
	@AttributeOverride(name="nombre_atributo", column=@Column(name="nombre_columna_tabla"))

ejemplo04

	PK compuesta.
	Caso múltimples Id. La clase tiene los atributos que forman la clave primaria
	Utilizamos multiples @Id
	@IdClass(NombreClasePK.class) (Debemos crear una clase que representa la PK)
	
ejemplo05

	PK compuesta.
	Caso Id insertable. La calse tiene una referencia a la clase de PK.
	La clase PK se anota como @Embeddable
	El atributo PK se anota como @EmbeddedId
	
ejemplo06

	Tipos de acceso.
	FIELD access. JPA accede a traves de los atributos.
	PROPERTY access. Accede a traves de los getters y setters.
	El acceso lo define dónde se coloque el @Id.
	@Transient. Ignora el atributo o la propiedad.

ejemplo07

	Estado de los objetos persistentes

ejemplo08
	Herencia. Estrategia Single Table
	En la clase madre:
		@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
		@DiscriminatorColumn(name = "nombre_columna", discriminatorType = DiscriminatorType.STRING) | CHAR | INTEGER
	En las clases hijas
		@Entity
		@DiscriminatorValue("valor")

ejemplo09
	Herencia. Estrategia Joined
	
ejemplo10
	Relacion uno a uno. Unidireccinal y bidireccional
	@OneToOne
	@JoinColumn(name = "nombre_fk")
	En bidireccional
	@OneToOne(mappedBy = "nombre_atributo_con_JoinColumn)
 
ejemplo11
	Colecciones de Tipos Basicos (Integer, Double, String, ...)
 	@ElementCollection
	@CollectionTable(name = "nombre_tabla_coleccion", joinColumns = {@JoinColumn(name="nombre_fk_1"),@JoinColumn(name="nombre_fk_2(si es compuesta)")})
	@Column(name = "nombre_columna_dato")
	- Comportamiento fetch por defecto. Modo Lazy
	@ElementCollection(fetch = fetchType.EAGER)
	
ejemplo12
	Relaciones Muchos a Uno unidireccional. (ManyToOne)
	@ManyToOne
	@JoinColumn(name = "nombre_fk")
	
	

 
